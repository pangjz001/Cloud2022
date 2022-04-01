package com.jbf.springcloud.Dao;

import com.jbf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: zhou
 * @Date: 2022/4/1 - 04 - 01 - 11:32
 * @Description: com.jbf.springcloud.Dao
 * @version: 1.0
 */
@Mapper
public interface PaymentDao {
    //增
    int create(Payment payment);
    //改     加上@Param注解，mapper中就可以采用#{}的方式把@Param注解括号内的参数进行引用
    Payment getPaymentById(@Param("id") Long id);
}
