package com.fitness.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class WebResourcesConfig extends WebMvcConfigurationSupport {

    //web资源服务器 注意：locations最后要加/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /* 静态资源服务器*/
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/staff/**").addResourceLocations("classpath:/templates/staff/");
//        registry.addResourceHandler("/user/**").addResourceLocations("classpath:/templates/user/");
        super.addResourceHandlers(registry);
    }
}
