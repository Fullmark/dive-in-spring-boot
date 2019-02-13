package com.fullmark.diveinspringboot.autoConfiguration;

import com.fullmark.diveinspringboot.annotation.enable.EnableHelloWorld;
import com.fullmark.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * Hello World 自动装配
 * @author fanghuanbiao
 */
@Configuration //spring 模式注解装配
@EnableHelloWorld //spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name",value = "Administrator") //条件装配
public class HelloWorldAutoConfiguration {
}
