package com.jbf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: zhou
 * @Date: 2022/4/1 - 04 - 01 - 11:20
 * @Description: com.jbf.springcloud.entities
 * @version: 1.0
 */
@Data   //set/get方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data; //泛型，对应类型的json数据

    //自定义两个参数的构造方法  data可能为null
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
