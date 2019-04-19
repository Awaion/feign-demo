package com.nighting.feign.restclient;

import org.springframework.cloud.openfeign.FeignClient;

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
