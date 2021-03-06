package com.fullmark.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 监听ContextRefreshedEvent事件
 * @author fanghuanbiao
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Hello World:"+contextRefreshedEvent.getApplicationContext().getId()
        +", timestamp:"+contextRefreshedEvent.getTimestamp());
    }
}
