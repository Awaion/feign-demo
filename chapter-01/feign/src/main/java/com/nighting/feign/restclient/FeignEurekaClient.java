package com.nighting.feign.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("eureka-client")
public interface FeignEurekaClient {

    @RequestMapping(method = RequestMethod.GET, value = "/helloGet")
    Map<String, Object> helloGet(@RequestParam("name") String name,
                                 @RequestParam("age") Integer age);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPostFormData")
    Map<String, Object> helloPostFormData(@RequestParam("name") String name,
                                          @RequestParam("age") Integer age);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPostUrlencoded")
    Map<String, Object> helloPostUrlencoded(@RequestParam("name") String name,
                                            @RequestParam("age") Integer age);


}
