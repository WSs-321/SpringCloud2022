package com.tree.springcloud.controller;

import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.entities.Payment;
import com.tree.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  16:49
 * @Description: TODO
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****结果: " + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****结果: " + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort: " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID:" + id, null);
        }
    }

    @GetMapping("/discovery/client")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("****** Application:" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getInstanceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping("/payment/fegin/timeout")
    public String paymentFeginTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "ziplin";
    }
}
