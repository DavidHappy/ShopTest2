package com.example.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.MultipartConfigElement;

/**
 * Created by user on 04.02.16.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BeanConfiguration
{
	@Bean
	MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("368KB");
		factory.setMaxRequestSize("368KB");
		return factory.createMultipartConfig();
	}

//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public javax.sql.DataSource dataSource() {
////		return DataSourceBuilder.create().build();
//		return new org.apache.tomcat.jdbc.pool.DataSource();
//	}

}
