package com.nighting.feign.restclient;

import com.nighting.feign.controller.XmlParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient("eureka-client")
public interface FeignEurekaClient {

    /**
     * GET请求
     * 从url获取请求参数
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/helloGet", method = RequestMethod.GET)
    Map<String, Object> helloGet(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestParam String name, @RequestParam Integer age);

    /**
     * POST请求
     * 从表单获取请求参数
     * multipart/form-data,它会将表单的数据处理为一条消息，以标签为单元，用分隔符分开。既可以上传键值对，也可以上传文件
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/helloPostFormData", method = RequestMethod.POST)
    Map<String, Object> helloPostFormData(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestParam String name, @RequestParam Integer age);

    /**
     * POST请求
     * 从表单获取请求参数
     * application/x-www-form-urlencoded：只能上传键值对，并且键值对都是间隔分开的。
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/helloPostUrlencoded", method = RequestMethod.POST)
    Map<String, Object> helloPostUrlencoded(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestParam String name, @RequestParam Integer age);

    /**
     * POST请求
     * 获取文本信息,没有key值,只有value
     * text
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/helloPostText", method = RequestMethod.POST)
    Map<String, Object> helloPostText(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody String name, @RequestParam Integer age);

    /**
     * POST请求
     * 获取文本信息,没有key值,只有value
     * text/plain: 没有格式的文本
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/helloPostTextPlain", method = RequestMethod.POST)
    Map<String, Object> helloPostTextPlain(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody String name, @RequestParam Integer age);

    /**
     * POST请求
     * json字符串
     * application/json
     *
     * @return
     */
    @RequestMapping(value = "/helloPostJson", method = RequestMethod.POST)
    Map<String, Object> helloPostJson(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody Map<String, Object> param, @RequestParam Integer age);

    /**
     * POST请求
     * application/xml
     *
     * @return
     */
    @RequestMapping(value = "/helloPostXml", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_XML_VALUE})
    Map<String, Object> helloPostXml(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody XmlParam xml, @RequestParam Integer age);

    /**
     * POST请求
     * text/xml
     *
     * @return
     */
    @RequestMapping(value = "/helloPostTextXml", consumes = MediaType.TEXT_XML_VALUE)
    Map<String, Object> helloPostTextXml(@RequestHeader String headerName, @RequestHeader Integer headerAge, @RequestBody XmlParam xml, @RequestParam Integer age);


}
