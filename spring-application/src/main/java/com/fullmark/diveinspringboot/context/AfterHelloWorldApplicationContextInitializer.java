package com.fullmark.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author fanghuanbiao
 */
public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer ,Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("After ApplicationContext Id= "+configurableApplicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE    ;
    }
}
