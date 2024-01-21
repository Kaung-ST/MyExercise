package com.example.securitymasterdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalErrorController {
    @ExceptionHandler(Throwable.class)
    public ModelAndView exceptionHandler(Throwable th)throws Throwable{
        ModelAndView mv=new ModelAndView();
        mv.addObject("cause",th.getCause().getMessage());
        mv.addObject("message",th.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
