package com.tree.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud
 * @Author: WSs_321
 * @CreateTime: 2022-09-08  15:45
 * @Description: TODO
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
