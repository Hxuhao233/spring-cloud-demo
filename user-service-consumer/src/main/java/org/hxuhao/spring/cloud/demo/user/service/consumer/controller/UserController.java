package org.hxuhao.spring.cloud.demo.user.service.consumer.controller;

import org.hxuhao.spring.cloud.demo.user.service.consumer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by hxuhao233 on 2018/12/8.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public String getUserById(@PathVariable("id")Integer id){
        return userService.getUserById(id);
    }


    @GetMapping(value = "/logUserInstance")
    public void logUserInstance(){
        ServiceInstance instance = loadBalancerClient.choose("user-service-provider");
        LOGGER.info("{}:{}:{}", instance.getServiceId(), instance.getHost(), instance.getPort());
    }

    @PostMapping(value = "/upload")
    public String upload(@RequestParam(value = "file")MultipartFile file) {
        return file.getName();
    }

    @PostMapping(value = "/test")
    public String test(@RequestParam(value = "test")String test) {
        return "a";
    }

}
