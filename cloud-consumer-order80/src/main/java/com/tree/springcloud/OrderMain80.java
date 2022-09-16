package com.tree.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  17:49
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyselfRule.class) // 启动该服务时去加载自定义的ribbon配置
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
