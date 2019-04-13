package com.nighting.feign.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("eureka-client")
public interface FeignEurekaClient {

    @RequestMapping(method = RequestMethod.GET, value = "/helloGet")
    Map<String, Object> helloGet(@RequestParam("name") String name);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPost")
    Map<String, Object> helloPost(@RequestParam("name") String name);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPostText")
    Map<String, Object> helloPostText(@RequestBody String name);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPostJson", consumes = "application/json")
    Map<String, Object> helloPostJson(@RequestBody Map<String, Object> param);
}
