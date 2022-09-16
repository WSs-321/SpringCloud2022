package com.tree.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.tree.springcloud.entities.CommonResult;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.myhandler
 * @Author: WSs_321
 * @CreateTime: 2022-09-13  16:38
 * @Description: TODO
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException-----2");
    }
}
