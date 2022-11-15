package com.cherepovski.Controller;

import com.cherepovski.model.Payment;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PayMentController {
    @GetMapping("/payment/history")
    public List<Payment> getPamentHistory(){

    }
}
