package com.tree.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: WSs_321
 * @date: 2022/09/13 23:27
 * @param:
 * @return:
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
