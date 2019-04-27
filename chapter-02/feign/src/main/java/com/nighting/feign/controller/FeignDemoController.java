package com.nighting.feign.controller;

import com.nighting.feign.restclient.FeignEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class FeignDemoController {

    @Autowired
    private FeignEurekaClient feignEurekaClient;

    /**
     * GET请求
     * 从url获取请求参数
     *
     * @param name
     * @return
     */
    @GetMapping("/helloGet")
    public Map<String, Object> helloGet(@RequestHeader String headerName, @RequestHeader Integer headerAge, String name, Integer age) {
        return feignEurekaClient.helloGet(headerName, headerAge, name, age);
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
    public Map<String, Object> helloPostFormData(HttpServletRequest request, String name, Integer age) {
        return feignEurekaClient.helloPostFormData(request.getHeader("headerName"), new Integer(request.getHeader("headerAge")), name, age);
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
    public Map<String, Object> helloPostUrlencoded(@RequestHeader String headerName, @RequestHeader Integer headerAge, String name, Integer age) {
        return feignEurekaClient.helloPostUrlencoded(headerName, headerAge, name, age);
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
    public Map<String, Object> helloPostText(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody String name, Integer age) {
        return feignEurekaClient.helloPostText(headerName, headerAge, name, age);
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
    public Map<String, Object> helloPostTextPlain(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody String name, Integer age) {
        return feignEurekaClient.helloPostTextPlain(headerName, headerAge, name, age);
    }

    /**
     * POST请求
     * json字符串
     * application/json
     *
     * @return
     */
    @PostMapping("/helloPostJson")
    public Map<String, Object> helloPostJson(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody Map<String, Object> param, Integer age) {
        return feignEurekaClient.helloPostJson(headerName, headerAge, param, age);
    }

    /**
     * POST请求
     * application/xml
     *
     * @return
     */
    @PostMapping(value = "/helloPostXml", consumes = {MediaType.APPLICATION_XML_VALUE})
    public Map<String, Object> helloPostXml(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody XmlParam xml, Integer age) {
        return feignEurekaClient.helloPostXml(headerName, headerAge, xml, age);
    }

    /**
     * POST请求
     * text/xml
     *
     * @return
     */
    @PostMapping(value = "/helloPostTextXml", consumes = MediaType.TEXT_XML_VALUE)
    public Map<String, Object> helloPostTextXml(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody XmlParam xml, Integer age) {
        return feignEurekaClient.helloPostTextXml(headerName, headerAge, xml, age);
    }

}
