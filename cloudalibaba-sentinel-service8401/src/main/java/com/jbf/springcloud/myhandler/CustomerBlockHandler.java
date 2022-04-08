package com.jbf.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jbf.springcloud.entities.CommonResult;

/**
 * @Auther: zhou
 * @Date: 2022/4/8 - 04 - 08 - 10:20
 * @Description: com.jbf.springcloud.myhandler
 * @version: 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 2");
    }
}

