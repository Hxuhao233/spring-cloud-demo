package org.hxuhao.spring.cloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hxuhao233 on 2018/12/8.
 */
@RestController
public class UserController {

    @Value("${mysql.url}")
    private String uri;

    @RequestMapping("getUri")
    public String getUri(){
        return uri;
    }
}
