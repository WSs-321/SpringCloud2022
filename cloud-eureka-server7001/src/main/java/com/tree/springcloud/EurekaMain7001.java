package com.tree.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  19:36
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
