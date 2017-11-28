package com.home.demo;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

import java.util.Arrays;

import org.activiti.engine.RuntimeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    		
    		
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

//        assertNotNull(ctx.getBean(RuntimeService.class));
//
//        System.out.println("通过Spring Boot启动了Http Server，以下是Spring Boot扫描的Bean列表：");
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println("found bean -> " + beanName);
//        }
    		
    }

}