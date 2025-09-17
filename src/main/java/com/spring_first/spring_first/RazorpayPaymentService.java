package com.spring_first.spring_first;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue="razorPay") // if in configuration file if the value of payment.provider is razorPay this will be the BEAN
public class RazorpayPaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment = "Razorpay payment.";
        System.out.println("Razorpay payment in its class");
        return payment;
    }
}
