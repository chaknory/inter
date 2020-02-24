package com.springboot.example.demo.interceptors;

import org.springframework.stereotype.Component;

@Component
public class ApplicationContext {

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
