package com.tree.springcloud.service.impl;

import com.tree.springcloud.dao.PaymentDao;
import com.tree.springcloud.entities.Payment;
import com.tree.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.com.atguigu.springcloud.service.impl
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  16:45
 * @Description: TODO
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
