package com.tree.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-08  19:31
 * @Description: TODO
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.version}") //gitee里的yml文件里的内容
    private String configInfo;

    @RequestMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
