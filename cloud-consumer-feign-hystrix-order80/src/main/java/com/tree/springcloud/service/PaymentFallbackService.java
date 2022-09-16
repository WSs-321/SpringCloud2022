package com.tree.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.service
 * @Author: WSs_321
 * @CreateTime: 2022-09-07  15:20
 * @Description: TODO
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_TimeOut,o(T~~T)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_TimeOut,o(T~~T)o";
    }
}
