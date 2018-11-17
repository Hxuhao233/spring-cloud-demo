package org.hxuhao.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by hxuhao233 on 2018/11/17.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaConfigServer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EurekaConfigServer.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConfigServer.class).web(true).run(args);
    }
}
