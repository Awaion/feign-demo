package com.nighting.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClientDemoController {

    @GetMapping("/helloGet")
    public Map<String, Object> helloGet(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @PostMapping("/helloPost")
    public Map<String, Object> helloPost(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @PostMapping("/helloPostText")
    public Map<String, Object> helloPostText(@RequestBody String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @PostMapping("/helloPostJson")
    public Map<String, Object> helloPostJson(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        return map;
    }

}