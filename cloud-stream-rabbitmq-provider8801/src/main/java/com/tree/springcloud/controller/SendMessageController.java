package com.tree.springcloud.controller;

import com.tree.springcloud.service.impl.MessageProviderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-09  13:40
 * @Description: TODO
 */
@RestController
public class SendMessageController {
    @Resource
    private MessageProviderImpl messageProvider;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        String result = messageProvider.send();
        return result;
    }
}
