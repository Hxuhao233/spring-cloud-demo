package org.hxuhao.spring.cloud.demo.user.service.controller;

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

    @Value("${mysql.url}")
    private String uri;

    @RequestMapping("getUri")
    public String getUri(){
        return uri;
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id")Integer id) {
        System.out.println(id);
        return "user";
    }



}
