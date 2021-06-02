package com.hb.jwtre.config;

import com.hb.jwtre.filter.MyFileter1;
import com.hb.jwtre.filter.MyFileter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<MyFileter1> filter1(){
        FilterRegistrationBean<MyFileter1> bean = new FilterRegistrationBean<>(new MyFileter1());
        bean.addUrlPatterns("/*");
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean<MyFileter2> filter2(){
        FilterRegistrationBean<MyFileter2> bean = new FilterRegistrationBean<>(new MyFileter2());
        bean.addUrlPatterns("/*");
        bean.setOrder(0);
        return bean;
    }
}
