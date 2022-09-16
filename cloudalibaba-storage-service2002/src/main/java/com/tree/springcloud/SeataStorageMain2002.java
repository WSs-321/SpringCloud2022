package com.tree.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud
 * @Author: WSs_321
 * @CreateTime: 2022-09-14  18:28
 * @Description: TODO
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SeataStorageMain2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageMain2002.class,args);
    }
}
