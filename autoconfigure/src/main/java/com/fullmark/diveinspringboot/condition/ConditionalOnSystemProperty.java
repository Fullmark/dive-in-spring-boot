package com.fullmark.diveinspringboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author fanghuanbiao
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * Java 系统属性名称
     * @return
     */
    String name();

    /**
     * Java 系统属性值
     * @return
     */
    String value();
}
