package com.tree.springcloud.dao;

import com.tree.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.dao
 * @Author: WSs_321
 * @CreateTime: 2022-09-13  23:47
 * @Description: TODO
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
