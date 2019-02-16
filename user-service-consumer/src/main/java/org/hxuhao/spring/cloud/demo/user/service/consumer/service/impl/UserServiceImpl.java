package org.hxuhao.spring.cloud.demo.user.service.consumer.service.impl;

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
    public String getUserById(Integer id) {
        return userServiceFeign.getUserById(id);
    }

}
