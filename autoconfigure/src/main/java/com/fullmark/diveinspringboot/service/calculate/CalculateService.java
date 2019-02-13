package com.fullmark.diveinspringboot.service.calculate;

/**
 * 计算服务
 * @author fanghuanbiao
 */
public interface CalculateService {

    /**
     * 从多个整数sum求和
     * @param values 多个整数
     * @return sum 累积和
     */
    Integer sum(Integer... values);
}
