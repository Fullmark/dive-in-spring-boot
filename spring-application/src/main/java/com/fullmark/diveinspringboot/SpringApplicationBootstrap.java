package com.fullmark.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpringApplicationBootstrap} 引导类
 * @author fanghuanbiao
 */

public class SpringApplicationBootstrap {
    public static void main(String[] args) {
       // SpringApplication.run(ApplicationConfiguration.class,args);
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication=  new SpringApplication();
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);//设为普通工程
        ConfigurableApplicationContext context=springApplication.run(args);
       // System.out.println("bean:"+context.getBean(ApplicationConfiguration.class));
    }

    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}
