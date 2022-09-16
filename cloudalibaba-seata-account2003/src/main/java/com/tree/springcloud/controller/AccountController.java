package com.tree.springcloud.controller;

import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-14  18:36
 * @Description: TODO
 */
@RestController
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功！");
    }

    @GetMapping("/a")
    public String test(){
        log.info("sss");
        return "success";
    }

    @GetMapping("/aa")
    public String testq(){
        log.info("sss");
        return "success";
    }
}