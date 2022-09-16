package com.tree.springcloud.service;

import com.tree.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.com.atguigu.springcloud.service
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  16:43
 * @Description: TODO
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
