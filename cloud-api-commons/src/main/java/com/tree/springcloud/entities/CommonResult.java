package com.tree.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.entities
 * @Author: WSs_321
 * @CreateTime: 2022-09-05  16:24
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 not found
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
