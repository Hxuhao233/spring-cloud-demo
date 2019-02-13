package org.hxuhao.spring.cloud.demo.user.service.client.controller;

import org.hxuhao.spring.cloud.demo.user.service.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hxuhao233 on 2018/12/8.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id")Integer id){
        return userService.getUserById(id);
    }
}
