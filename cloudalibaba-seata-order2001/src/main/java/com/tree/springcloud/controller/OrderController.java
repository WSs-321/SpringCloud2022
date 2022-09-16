package com.tree.springcloud.controller;

import com.tree.springcloud.domain.Order;
import com.tree.springcloud.entities.CommonResult;
import com.tree.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.controller
 * @Author: WSs_321
 * @CreateTime: 2022-09-14  00:11
 * @Description: TODO
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }

    @GetMapping("/a")
    public String test(){
        log.info("sss");
        return "success";
    }

}
