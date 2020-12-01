package com.yu.springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalanced {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
