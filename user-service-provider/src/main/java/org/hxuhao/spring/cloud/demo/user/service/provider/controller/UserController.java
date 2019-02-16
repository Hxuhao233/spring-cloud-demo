package org.hxuhao.spring.cloud.demo.user.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping(value = "/{id}")
    public String getUserById(@PathVariable("id")Integer id) {
        System.out.println(id);
        return "user " + id;
    }



}
