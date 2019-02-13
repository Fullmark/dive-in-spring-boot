package com.fullmark.diveinspringboot.service.calculate;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author fanghuanbiao
 */
@SpringBootApplication(scanBasePackages = "com.fullmark.diveinspringboot.service.calculate")
public class CalculateBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new SpringApplicationBuilder(CalculateBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java7")
                .run(args);
        //calculateService bean是否存在
        CalculateService calculateService=context.getBean(CalculateService.class);
        System.out.println("calculateService.sum(1...10):"+calculateService.sum(1,2,3,4,5,6,7,8,9,10));
        context.close();
    }
}
