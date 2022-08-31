package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author pt
 * @date 2022/8/21 12:13
 * @since JDK1.8
 */
@Controller
public class HelloController {
    // /相当于http://localhost:8080/SpringMVC/
    @RequestMapping("/")
    public String protal(){
        //将逻辑试图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
