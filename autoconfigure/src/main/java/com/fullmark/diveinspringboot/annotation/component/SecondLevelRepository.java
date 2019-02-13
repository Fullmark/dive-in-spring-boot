package com.fullmark.diveinspringboot.annotation.component;

import java.lang.annotation.*;

/**
 *  @Component层次性
 *      @Component
 *          @Repository
 *              @FirstLevelRepository
 *                  @SecondLevelRepository
 * @author fanghuanbiao
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
