package cn.com.hades.feign;

import cn.com.hades.examples.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "spring-cloud-provider-1")
public interface FeignUserClient {
    /** 普通 */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String queryUser();

    /** 传递对象 */
    // 实际上是对象转json，作为请求报文
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    String sendUser(@RequestBody User sms);

    /** 获取短信内容 */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User getUser(@PathVariable("id") String id);

    /** 这是一个会报错的请求，测试fallback */
  /*  @RequestMapping(value = "/fail404", method = RequestMethod.GET)
    String fail404();*/
}
