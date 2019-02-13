package org.hxuhao.spring.cloud.demo.user.service.client.service.impl;

import org.hxuhao.spring.cloud.demo.user.service.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hxuhao233 on 2019/2/13.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getUserById(Integer id) {
        return restTemplate.getForObject("http://user-service/users/{id}", String.class, id);
    }

}
