package com.nighting.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClientDemoController {

    /**
     * GET请求
     * 从url获取请求参数
     *
     * @param name
     * @return
     */
    @GetMapping("/helloGet")
    public Map<String, Object> helloGet(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    /**
     * POST请求
     * 从表单获取请求参数
     * multipart/form-data,它会将表单的数据处理为一条消息，以标签为单元，用分隔符分开。既可以上传键值对，也可以上传文件
     *
     * @param name
     * @return
     */
    @PostMapping("/helloPostFormData")
    public Map<String, Object> helloPostFormData(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    /**
     * POST请求
     * 从表单获取请求参数
     * application/x-www-form-urlencoded：只能上传键值对，并且键值对都是间隔分开的。
     *
     * @param name
     * @return
     */
    @PostMapping("/helloPostUrlencoded")
    public Map<String, Object> helloPostUrlencoded(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    /**
     * POST请求
     * 获取文本信息,没有key值,只有value
     * text
     *
     * @param name
     * @return
     */
    @PostMapping("/helloPostText")
    public Map<String, Object> helloPostText(@RequestBody String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    /**
     * POST请求
     * 获取文本信息,没有key值,只有value
     * text/plain: 没有格式的文本
     *
     * @param name
     * @return
     */
    @PostMapping("/helloPostTextPlain")
    public Map<String, Object> helloPostTextPlain(@RequestBody String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    /**
     * POST请求
     * json字符串
     * application/json
     *
     * @return
     */
    @PostMapping("/helloPostJson")
    public Map<String, Object> helloPostJson(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        return map;
    }

    /**
     * POST请求
     * application/javascript
     *
     * @return
     */
    @PostMapping("/helloPostJavascript")
    public Map<String, Object> helloPostJavascript(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        return map;
    }

    /**
     * POST请求
     * application/xml
     *
     * @return
     */
    @PostMapping("/helloPostXml")
    public Map<String, Object> helloPostXml(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        return map;
    }

    /**
     * POST请求
     * text/xml
     *
     * @return
     */
    @PostMapping("/helloPostTextXml")
    public Map<String, Object> helloPostTextXml(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        return map;
    }

    /**
     * POST请求
     * text/html
     *
     * @return
     */
    @PostMapping("/helloPostTextHtml")
    public Map<String, Object> helloPostTextHtml(@RequestBody Map<String, Object> param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", param.get("name"));
        return map;
    }


}
