package org.hxuhao.spring.cloud.demo.user.service.consumer.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixException;
import com.netflix.hystrix.exception.HystrixTimeoutException;
import org.hxuhao.spring.cloud.demo.user.service.consumer.feign.UserServiceFeign;
import org.hxuhao.spring.cloud.demo.user.service.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hxuhao233 on 2019/2/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @Override
    @HystrixCommand(fallbackMethod = "getUserByIdFallBack")
    public String getUserById(Integer id) {
        return userServiceFeign.getUserById(id);
    }

    public String getUserByIdFallBack(Integer id) throws HystrixTimeoutException {
        System.err.println("getUserById error");
        throw new HystrixTimeoutException();
    }

}
