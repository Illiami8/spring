package com.cherepovski.model.repository;

import com.cherepovski.model.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaymentRepository {

    private Map<Integer, Payment> paymentMap = new HashMap<>();


    @PostConstruct
    private void init() {
        Payment payment1 = Payment.builder()
                .id(1)
                .pan("11111")
                .amount(100)
                .build();
        Payment payment2 = Payment.builder()
                .id(2)
                .pan("22222")
                .amount(200)
                .build();
        paymentMap.put(1, payment1);
        paymentMap.put(2, payment2);

        lastId = 2;
    }
}
