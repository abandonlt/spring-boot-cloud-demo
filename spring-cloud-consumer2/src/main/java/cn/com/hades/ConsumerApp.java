package cn.com.hades;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerApp.class).web(true).run(args);
    }

    @Bean
    public IRule ribbonRule() {
        //随机
        return new RandomRule();
        //轮询
//        return new RoundRobinRule();
    }
}
