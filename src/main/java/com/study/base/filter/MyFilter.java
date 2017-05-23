package com.study.base.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Created by Administrator on 2017/5/23.
 */

//@WebFilter(filterName="myFilter",urlPatterns="/*")
public class MyFilter implements Filter {


    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }


    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        chain.doFilter(request, response);
    }


    public void destroy() {
        System.out.println("过滤器销毁");
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
