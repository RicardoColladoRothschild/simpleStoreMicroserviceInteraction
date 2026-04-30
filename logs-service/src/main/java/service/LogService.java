package service;

import dto.PaymentLogRequest;
import entity.PaymentLog;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class LogService {


    @Transactional
    public void save(PaymentLogRequest dto){
        PaymentLog log = new PaymentLog();
        log.setPayer(dto.getPayer());
        log.setAmount(dto.getAmount());
        log.setCreatedAt(LocalDateTime.now());
        log.persist();

    }

    public List<PaymentLog> listAllPaymentLogs(){
        return PaymentLog.listAll();
    }

}
