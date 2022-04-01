package com.jbf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: zhou
 * @Date: 2022/4/1 - 04 - 01 - 11:19
 * @Description: com.jbf.springcloud.entities
 * @version: 1.0
 */
@Data   //set/get方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class Payment implements Serializable {
    private long id;
    private String serial;
}
