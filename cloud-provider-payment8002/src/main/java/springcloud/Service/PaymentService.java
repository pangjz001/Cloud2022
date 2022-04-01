package springcloud.Service;

import com.jbf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: zhou
 * @Date: 2022/4/1 - 04 - 01 - 14:05
 * @Description: com.jbf.springcloud.Service
 * @version: 1.0
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
