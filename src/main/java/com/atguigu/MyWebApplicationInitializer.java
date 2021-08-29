package com.atguigu;

import com.atguigu.config.AppConfig;
import com.atguigu.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @description:web容器启动时创建对象；调用方法来初始化容器以及前端控制器
 * @author: gxl
 * @createDate: 2021/8/29 19:02
 */
public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //获取根容器的配置类；（Spring的配置文件）   父容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    //获取web容器的配置类（SpringMVC配置文件）  子容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    //获取DispatcherServlet的映射信息
    // /：拦截所有请求（包括静态资源【*.js、*.png...】），但不包括*.jsp
    // /*：拦截所有请求，包括*.jsp页面；jsp页面是tomcat的jsp引擎解析的。
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
