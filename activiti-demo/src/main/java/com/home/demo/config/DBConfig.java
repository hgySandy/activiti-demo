package com.home.demo.config;

import java.sql.Driver;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
//配置类千万不要忘了这个注解
@Configuration
//扫描 Mapper 接口并容器管理
//@MapperScan(basePackages = DBConfig.PACKAGE, sqlSessionFactoryRef = "sessionFactory")
public class DBConfig {

	// 精确到 spring 目录，以便跟其他数据源隔离
//	static final String PACKAGE = "com.home.demo.dao";
//	static final String MAPPER_LOCATION = "classpath:mybatis/*.xml";
	
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	
	@Bean(name = "dataSource")
	//@Primary //用@Primary 告诉spring 在犹豫的时候优先选择哪一个具体的实现(有多个实现的时候)
	public SimpleDriverDataSource dataSource() throws ClassNotFoundException {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass((Class<? extends Driver>) Class.forName(driver));
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	

	
	@Bean(name = "sessionFactory")
	@Primary
	public LocalSessionFactoryBean sessionFactory(
			@Qualifier("dataSource") DataSource dataSource,ApplicationContext applicationContext)
			throws Exception {
		
		
		final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setNamingStrategy(new ImprovedNamingStrategy());
		//sessionFactory.setMapperLocations(applicationContext.getResources(DBConfig.MAPPER_LOCATION));
		Properties hibernateProperties = new Properties();	
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "false");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		sessionFactory.setHibernateProperties(hibernateProperties);
		sessionFactory.setPackagesToScan("com.home.demo.entity");
		
		return sessionFactory;
	}
	
	@Bean(name = "transactionManager")
	@Primary
	public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
    
}
