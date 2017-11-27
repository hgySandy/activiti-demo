package com.home.demo.config;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.form.AbstractFormType;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.form.FormEngine;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.home.demo.form.BigtextFormType;
import com.home.demo.form.DoubleFormType;
import com.home.demo.form.JavascriptFormType;
import com.home.demo.form.MyFormEngine;
import com.home.demo.form.UsersFormType;
import com.home.demo.util.MyProcessDiagramGenerator;

@Configuration
public class ProcessEngineConfig {
	
	
	
	@Bean(name = "processEngineConfiguration")
	@Primary
	public ProcessEngineConfiguration processEngineConfiguration(@Qualifier("dataSource") DataSource dataSource,@Qualifier("transactionManager")DataSourceTransactionManager transactionManager) {
		SpringProcessEngineConfiguration processEngineConfiguration = new SpringProcessEngineConfiguration();
		processEngineConfiguration.setProcessEngineName("spring");
		processEngineConfiguration.setDataSource(dataSource);      
		processEngineConfiguration.setTransactionManager(transactionManager);
		processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		processEngineConfiguration.setJobExecutorActivate(false);
		processEngineConfiguration.setMailServerPort(2025);
		processEngineConfiguration.setActivityFontName("宋体");
		
		List<AbstractFormType> formType = new ArrayList<AbstractFormType>();
		formType.add(new JavascriptFormType());
		formType.add(new UsersFormType());
		formType.add(new DoubleFormType());
		formType.add(new BigtextFormType());
		processEngineConfiguration.setCustomFormTypes(formType);
		
		List<FormEngine> formEngine = new ArrayList<FormEngine>();
		formEngine.add(new MyFormEngine());
		processEngineConfiguration.setCustomFormEngines(formEngine);
		
		processEngineConfiguration.setProcessDiagramGenerator(new MyProcessDiagramGenerator());
		
		
		
//		Set<Class<?>> customMybatisMappers = new HashSet<Class<?>>();
//		customMybatisMappers.addAll((Collection<? extends Class<?>>) new TaskQueryMapper());
//		processEngineConfiguration.setCustomMybatisMappers(customMybatisMappers);
		
		
		/*	自动部署配置	
		 * <property name="deploymentResources">
				<list>
					<value>classpath*:/chapter8/leave-mail*.zip</value>
					<value>classpath*:/chapter9/leave-countersign.zip</value>
					<value>classpath*:/chapter10/purchase*.zip</value>
					<value>classpath*:/chapter10/payment.zip</value>
				</list>
			</property>
		processEngineConfiguration.setDeploymentResources();*/
		
		return processEngineConfiguration;
	}
	
	
	
	@Bean(name = "processEngine")
	@Primary
	public ProcessEngineFactoryBean processEngine(
			@Qualifier("processEngineConfiguration") ProcessEngineConfiguration processEngineConfiguration)
			throws Exception {
		ProcessEngineFactoryBean processEngine = new ProcessEngineFactoryBean();
		processEngine.setProcessEngineConfiguration((ProcessEngineConfigurationImpl) processEngineConfiguration);
		return processEngine;
	}

//	@Bean(name = "processEngine")
//	@Primary
//	public ProcessEngine processEngine(
//			@Qualifier("processEngineConfiguration") ProcessEngineConfiguration processEngineConfiguration)
//			throws Exception {
//		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
//		return processEngine;
//	}
	
	@Bean(name = "repositoryService")
	@Primary
	public RepositoryService repositoryService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getRepositoryService();
	}
	
	@Bean(name = "runtimeService")
	@Primary
	public RuntimeService runtimeService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getRuntimeService();
	}

	@Bean(name = "formService")
	@Primary
	public FormService formService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getFormService();
	}
	
	@Bean(name = "identityService")
	@Primary
	public IdentityService identityService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getIdentityService();
	}
	
	@Bean(name = "taskService")
	@Primary
	public TaskService taskService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getTaskService();
	}
	
	
	@Bean(name = "historyService")
	@Primary
	public HistoryService historyService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getHistoryService();
	}
	
	@Bean(name = "managementService")
	@Primary
	public ManagementService managementService(
			@Qualifier("processEngine") ProcessEngine processEngine)
					throws Exception {
		return processEngine.getManagementService();
	}
	

	
}
