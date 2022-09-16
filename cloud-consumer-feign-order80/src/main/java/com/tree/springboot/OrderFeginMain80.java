package com.tree.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springboot
 * @Author: WSs_321
 * @CreateTime: 2022-09-06  21:08
 * @Description: TODO
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients
public class OrderFeginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain80.class, args);
    }
}
