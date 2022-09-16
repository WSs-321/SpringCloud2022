package com.tree.springboot.controller;

import com.tree.springboot.service.PaymentFeginService;
import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springboot.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-06  21:23
 * @Description: TODO
 */
@RestController
@Slf4j
public class OrderFeginController {
    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeginService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/fegin/timeout")
    public String paymentFeginTimeout() {
        //openfegin-ribbon: 一般默认等待一秒,超过一秒报错
        return paymentFeginService.paymentFeginTimeout();
    }

}