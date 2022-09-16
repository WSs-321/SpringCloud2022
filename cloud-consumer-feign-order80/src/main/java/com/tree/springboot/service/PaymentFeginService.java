package com.tree.springboot.service;

import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springboot.service
 * @Author: WSs_321
 * @CreateTime: 2022-09-06  21:12
 * @Description: TODO
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeginService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/fegin/timeout")
    String paymentFeginTimeout();
}
