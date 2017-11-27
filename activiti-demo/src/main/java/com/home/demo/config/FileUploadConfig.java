package com.home.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 该类进行常规配置
 * 
 * @author Huang Gangyu
 * 
 */
@Configuration
public class FileUploadConfig {

	/**
	 * 文件上传配置
	 * @return
	 */
//	@Bean
//	public MultipartConfigElement multipartConfigElement() {
//		MultipartConfigFactory factory = new MultipartConfigFactory();
//		// 文件最大
//		factory.setMaxFileSize("10240KB"); // KB,MB
//		// 设置总上传数据总大小
//		factory.setMaxRequestSize("102400KB");
//		return factory.createMultipartConfig();
//	}
	
	@Bean
	public CommonsMultipartResolver commonsMultipartResolver() {
		return new CommonsMultipartResolver();
	}
	
	

}