package com.fullmark.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 监听ContextRefreshedEvent事件
 * @author fanghuanbiao
 */
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> ,Ordered{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("After Hello World:"+contextRefreshedEvent.getApplicationContext().getId()
        +", timestamp:"+contextRefreshedEvent.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
