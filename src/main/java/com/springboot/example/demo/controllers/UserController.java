package com.springboot.example.demo.controllers;

import com.springboot.example.demo.interceptors.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    private ApplicationContext applicationContext;

    public UserController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    ApplicationContext getContext() {
        return this.applicationContext;
    }
}
