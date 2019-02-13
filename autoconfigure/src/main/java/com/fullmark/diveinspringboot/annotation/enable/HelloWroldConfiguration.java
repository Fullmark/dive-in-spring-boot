package com.fullmark.diveinspringboot.annotation.enable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanghuanbiao
 */
@Configuration
public class HelloWroldConfiguration {

    @Bean
    public String helloWorld(){ //方法名即bean名称
        return "Hello World 2019";
    }
}
