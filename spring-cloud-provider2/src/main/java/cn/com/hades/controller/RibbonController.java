package cn.com.hades.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @RequestMapping("/hello")
    public String findString(){
        System.out.println("------调用到了消费者2---------");
        return "this is provider two";
    }

}
