package com.fullmark.diveinspringboot.service.calculate;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Java8 Lambda实现
 * @author fanghuanbiao
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        //int sum =Stream.of(values).reduce(0,(a, b) -> a+b);
        int count =Stream.of(values).reduce(0,Integer::sum);
        return count;
    }
    public static void main(String[] args) {
        CalculateService calculateService=new Java8CalculateService();
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
