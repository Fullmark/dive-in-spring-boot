package com.fullmark.diveinspringboot.annotation.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 激活HelloWorld模块
 * @author fanghuanbiao
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWroldConfiguration.class)
//@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
