package com.fullmark.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.fullmark.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DiveInSpringBootApplication.class)
			.web(WebApplicationType.NONE)//设置不是web应用
			.run(args);
	}

}

