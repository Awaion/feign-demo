package com.nighting.feign.restclient;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient("eureka-client")
public interface FeignEurekaClient {

    @RequestMapping(method = RequestMethod.GET, value = "/helloGet",headers = {"name=hearderName"})
    Map<String, Object> helloGet(@RequestParam("name") String name);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPost")
    Map<String, Object> helloPost(@RequestParam("name") String name);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPostText")
    Map<String, Object> helloPostText(@RequestBody String name);

    @RequestMapping(method = RequestMethod.POST, value = "/helloPostJson", consumes = "application/json")
    Map<String, Object> helloPostJson(@RequestHeader("name") Map<String, Object> param);
}
