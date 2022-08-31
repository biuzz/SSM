package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author pt
 * @date 2022/8/22 16:39
 * @since JDK1.8
 */

@Controller
public class TestViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }


    //服务器内请求转发
    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){

        return "forward:/test/model";
    }

    //请求重定向
    @RequestMapping("/test/view/redirect")
    public String testRedirectView(){
        return "redirect:/test/model";
    }
}
