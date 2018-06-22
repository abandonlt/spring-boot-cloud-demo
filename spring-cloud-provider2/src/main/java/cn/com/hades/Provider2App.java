package cn.com.hades;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider2App {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Provider2App.class).web(true).run(args);
    }
}
