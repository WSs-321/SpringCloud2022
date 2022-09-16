package com.tree.springcloud.controller;

import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-13  17:32
 * @Description: TODO
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    //模拟sql查询
    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "xcxcxcxcxcxcxcxcxcxcxcxcxc11111111"));
        hashMap.put(2L, new Payment(2L, "xcxcxcxcggggggggg2222222222222222"));
        hashMap.put(3L, new Payment(3L, "xcxcxcxccxxcxcfafdgdgdsgdsgds33333"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult paymentSql(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult result = new CommonResult(200, "from mysql, server port : " + serverPort + " ,", payment);
        return result;
    }
}
