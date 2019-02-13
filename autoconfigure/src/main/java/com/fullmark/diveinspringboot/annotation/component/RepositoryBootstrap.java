package com.fullmark.diveinspringboot.annotation.component;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fanghuanbiao
 */
@ComponentScan(basePackages = "com.fullmark.diveinspringboot.annotation.component")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //检测MyFirstLevelRepository bean是否存在
        MyFirstLevelRepository myFirstLevelRepository=context.getBean("myFirstLevelRepository",MyFirstLevelRepository.class);
        System.out.println("MyFirstLevelRepository bean"+myFirstLevelRepository);
        context.close();
    }
}
