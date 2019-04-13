package com.nighting.feign.controller;

import com.nighting.feign.restclient.FeignEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FeignDemoController {

    @Autowired
    private FeignEurekaClient feignEurekaClient;

    @GetMapping("/helloGet")
    public Map<String, Object> helloGet(String name) {
        Map<String, Object> map = feignEurekaClient.helloGet(name);
        return map;
    }

    @PostMapping("/helloPost")
    public Map<String, Object> helloPost(String name) {
        Map<String, Object> map = feignEurekaClient.helloPost(name);
        return map;
    }

    @PostMapping("/helloPostText")
    public Map<String, Object> helloPostText(@RequestBody String name) {
        Map<String, Object> map = feignEurekaClient.helloPostText(name);
        return map;
    }

    @PostMapping("/helloPostJson")
    public Map<String, Object> helloPostBody(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = feignEurekaClient.helloPostJson(param);
        return map;
    }

}
