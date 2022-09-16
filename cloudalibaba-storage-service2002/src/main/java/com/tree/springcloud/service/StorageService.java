package com.tree.springcloud.service;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.service
 * @Author: WSs_321
 * @CreateTime: 2022-09-14  18:24
 * @Description: TODO
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);

}