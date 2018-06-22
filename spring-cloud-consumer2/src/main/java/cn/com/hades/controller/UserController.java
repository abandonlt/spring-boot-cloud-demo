package cn.com.hades.controller;

import cn.com.hades.examples.User;
import cn.com.hades.feign.FeignEurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class UserController {
    public static Logger logger = LoggerFactory.getLogger(UserController.class);

//    @Autowired
//    FeignUserClient feignUserClient;

    @Autowired
    FeignEurekaClient feignEurekaClient;

    // get 请求
    @RequestMapping("/test1")
    public String test1() {
        String body = feignEurekaClient.queryUser();
        return body;
    }

    // post 请求
    @RequestMapping("/test2")
    public String test2(@RequestBody User user) {
        String body = feignEurekaClient.sendUser(user);
        return body;
    }

    @RequestMapping("/test4")
    public User test4(String id) {
        User sendSmsTemplate = feignEurekaClient.getUser(id);
        return sendSmsTemplate;
    }

    @RequestMapping("/hello")
    public String findString(){
        return feignEurekaClient.findString();
    }
   /* @RequestMapping("/test5")
    public String test5() {
        String sendSmsTemplate = feignUserClient.fail404();
        return sendSmsTemplate;
    }*/
}
