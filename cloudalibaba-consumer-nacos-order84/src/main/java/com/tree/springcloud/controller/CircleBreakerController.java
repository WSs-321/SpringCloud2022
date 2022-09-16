package com.tree.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.entities.Payment;
import com.tree.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-13  17:49
 * @Description: TODO
 */
@RestController
@Slf4j
public class CircleBreakerController {
    private static final String PAYMENT_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback")//没有配置
//    @SentinelResource(value = "fallback", fallback = "handleFallback") //fallback只处理业务异常
//    @SentinelResource(value = "fallback",blockHandler = "blockHandler")
    @SentinelResource(value = "fallback", fallback = "handleFallback", blockHandler = "blockHandler",
            exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult fallback(@PathVariable("id") Long id) {
        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException...非法参数异常");
        } else if (id > 4) {
            throw new NullPointerException("NullPointerException...空指针异常");
        }
        return restTemplate.getForObject(PAYMENT_URL + "/paymentSQL/" + id, CommonResult.class);
    }

    //兜底方法
    public CommonResult handleFallback(@PathVariable("id") Long id, Throwable e) {
        Payment payment = new Payment(id, null);
        return new CommonResult(444, "---兜底异常handlerFallback,exception内容：" + e.getMessage(), payment);
    }

    public CommonResult blockHandler(@PathVariable("id") Long id, BlockException e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult(445, "blockHandler-sentinel限流,blockException:" + e.getMessage(), payment);
    }

    //    =============OpenFeign=======
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        CommonResult<Payment> result = paymentService.paymentSQL(id);
        return result;

    }

}
