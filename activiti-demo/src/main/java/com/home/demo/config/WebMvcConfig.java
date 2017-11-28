//package com.home.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = { "com.home.demo.controller" })
//public class WebMvcConfig extends WebMvcConfigurerAdapter {
//
//
//
////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/main/index").setViewName("/main/index");
////    }
//    
//    //如果继承了WebMvcConfigurerAdapter,就无法不授权访问swagger-ui.html,在此进行配置
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//        		.addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("swagger-ui.html")
//        		.addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//        		.addResourceLocations("classpath:/META-INF/resources/webjars/");
//        registry.addResourceHandler("/img/**")
//			.addResourceLocations("/img/");
//        registry.addResourceHandler("/css/**")
//        		.addResourceLocations("/css/");
//        registry.addResourceHandler("/js/**")
//        		.addResourceLocations("/js/");
//        super.addResourceHandlers(registry);
//    }
//
//
//}
