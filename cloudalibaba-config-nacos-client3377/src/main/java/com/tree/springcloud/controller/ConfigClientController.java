package com.tree.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-09  21:16
 * @Description: TODO
 */
@RestController
@RefreshScope   //支持Nacos动态刷新
public class ConfigClientController {
    @Value("${config.info}") //
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}

