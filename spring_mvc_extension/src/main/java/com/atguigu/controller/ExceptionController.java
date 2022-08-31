package com.atguigu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Description:
 *
 * @author pt
 * @date 2022/8/26 14:57
 * @since JDK1.8
 */
//将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex,Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
