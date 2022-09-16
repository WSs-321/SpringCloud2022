package com.tree.springcloud.service;

import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.service
 * @Author: WSs_321
 * @CreateTime: 2022-09-13  18:42
 * @Description: TODO
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult(44444, "服务降级返回，---PaymentFallbackService:", new Payment(id,"errorSerial"));

    }
}
