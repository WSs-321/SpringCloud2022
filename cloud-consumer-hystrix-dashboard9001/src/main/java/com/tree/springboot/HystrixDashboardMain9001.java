package com.tree.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springboot
 * @Author: WSs_321
 * @CreateTime: 2022-09-07  16:44
 * @Description: TODO
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
