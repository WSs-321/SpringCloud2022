package com.tree.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.com.atguigu.springcloud
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  23:24
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
