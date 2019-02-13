package com.fullmark.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author fanghuanbiao
 */
@Order(Ordered.HIGHEST_PRECEDENCE)//排序：最高优先级
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C c) {
        System.out.println("ConfigurableApplicationContext.id="+c.getId());
    }
}
