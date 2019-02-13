package com.fullmark.diveinspringboot.annotation.enable;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author fanghuanbiao
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld",String.class);
        System.out.println("Hello World bean"+helloWorld);
        context.close();
    }
}
