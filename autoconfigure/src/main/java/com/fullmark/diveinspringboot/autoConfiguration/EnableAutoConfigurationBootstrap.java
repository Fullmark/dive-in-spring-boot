package com.fullmark.diveinspringboot.autoConfiguration;

import com.fullmark.diveinspringboot.annotation.enable.EnableHelloWorldBootstrap;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author fanghuanbiao
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld",String.class);
        System.out.println("Hello World bean"+helloWorld);
        context.close();
    }
}
