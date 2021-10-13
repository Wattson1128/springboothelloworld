package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 说明这是一个控制器类
 */
@Controller
public class DemoController {
    /**
     * 浏览器访问hello方法,在页面显示Hello World
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
