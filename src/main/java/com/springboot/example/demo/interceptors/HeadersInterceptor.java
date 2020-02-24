package com.springboot.example.demo.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

@Component
public class HeadersInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) {
        final Enumeration<String> headers = request.getHeaders("user");
        final List<String> users = Collections.list(headers);

        if(!users.isEmpty()){
            String userName = users.get(0);
            this.applicationContext.setUser(userName);
        }

        return true;
    }
}
