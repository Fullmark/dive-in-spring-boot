package com.fullmark.diveinspringboot.annotation.component;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 一级（@link Repository @Repository）
 * @Component派生性
 *      @Component
 *          @Repository
 *              @FirstLevelRepository
 * @author fanghuanbiao
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
    String value() default "";
}
