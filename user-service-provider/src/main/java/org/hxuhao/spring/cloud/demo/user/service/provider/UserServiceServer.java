package org.hxuhao.spring.cloud.demo.user.service.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by hxuhao233 on 2018/12/8.
 */
@EnableEurekaClient
@SpringBootApplication
public class UserServiceServer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(UserServiceServer.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServiceServer.class).web(true).run(args);
    }
}
