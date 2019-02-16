package org.hxuhao.spring.cloud.demo.user.service.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by hxuhao233 on 2019/2/16.
 */

@FeignClient(name = "user-service-provider")
public interface UserServiceFeign {

    @GetMapping(value = "/users/{id}")
    public String getUserById(@PathVariable("id")Integer id);
}
