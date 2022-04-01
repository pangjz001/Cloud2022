package springcloud.Service.impl;


import com.jbf.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.Dao.PaymentDao;
import springcloud.Service.PaymentService;

/**
 * @Auther: zhou
 * @Date: 2022/4/1 - 04 - 01 - 14:08
 * @Description: com.jbf.springcloud.Service
 * @version: 1.0
 */
@Service
public class PaymentServiceIpml implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
