package com.nighting.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ClientDemoController {

    @GetMapping("/helloGet")
    public Map<String, Object> helloGet(String name, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("getAuthType", request.getAuthType());
        map.put("getContextPath", request.getContextPath());
        map.put("getCookies", request.getCookies());
        map.put("getDateHeader", request.getDateHeader("yyyy-MM-dd HH:mm:ss"));
        map.put("getHeaderName", request.getHeader("name"));
        map.put("getHeaderContentType", request.getHeader("Content-Type"));
        return map;
    }

    @PostMapping("/helloPost")
    public Map<String, Object> helloPost(String name, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("getHeaderName", request.getHeader("name"));
        map.put("getHeaderContentType", request.getHeader("Content-Type"));
        return map;
    }

    @PostMapping("/helloPostText")
    public Map<String, Object> helloPostText(@RequestBody String name, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("getHeaderName", request.getHeader("name"));
        map.put("getHeaderContentType", request.getHeader("Content-Type"));
        return map;
    }

    @PostMapping("/helloPostJson")
    public Map<String, Object> helloPostJson(@RequestBody Map<String, Object> param, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        map.put("getHeaderName", request.getHeader("name"));
        map.put("getHeaderContentType", request.getHeader("Content-Type"));
        return map;
    }

}
