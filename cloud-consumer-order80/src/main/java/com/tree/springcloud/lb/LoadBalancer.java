package com.tree.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.lb
 * @Author: WSs_321
 * @CreateTime: 2022-09-06  17:31
 * @Description: TODO
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
