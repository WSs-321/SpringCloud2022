package com.tree.springboot.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springboot.config
 * @Author: WSs_321
 * @CreateTime: 2022-09-06  22:32
 * @Description: TODO
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
