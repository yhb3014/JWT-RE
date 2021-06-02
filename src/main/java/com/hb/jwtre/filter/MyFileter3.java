package com.hb.jwtre.filter;


import javax.servlet.*;
import java.io.IOException;

public class MyFileter3 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("필터3");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
