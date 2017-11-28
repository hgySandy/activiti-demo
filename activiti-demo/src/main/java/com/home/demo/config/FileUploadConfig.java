package com.home.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

/**
 * 该类进行常规配置
 * 
 * @author Huang Gangyu
 * 
 */
@Configuration
public class FileUploadConfig {
	
	@Bean
	public MultipartResolver multipartResolver() {
		MultipartResolver multipartResolver = new StandardServletMultipartResolver();
	    return multipartResolver;
	}

}