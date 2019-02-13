package com.fullmark.diveinspringboot.condition;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Administrator
 * @author fanghuanbiao
 */
public class ConditionalOnSystemPropertyBootstrap {
    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "Administrator")
    public String helloWorld(){
        return "Hello World fullmark";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context= new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld=context.getBean("helloWorld",String.class);
        System.out.println("helloWorld bean: "+helloWorld);
        context.close();
    }
}
