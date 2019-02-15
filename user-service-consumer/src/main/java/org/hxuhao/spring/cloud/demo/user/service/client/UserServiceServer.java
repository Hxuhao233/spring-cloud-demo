package org.hxuhao.spring.cloud.demo.user.service.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hxuhao233 on 2018/12/8.
 */
@EnableEurekaClient
@SpringBootApplication
public class UserServiceServer extends SpringBootServletInitializer {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(UserServiceServer.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServiceServer.class).web(true).run(args);
    }
}
