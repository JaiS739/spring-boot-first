package com.spring_first.spring_first;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue="stripe")
public class StripePaymentService implements PaymentService{

    @Override
    public String pay () {
        String payment = "Stripe payment servce";
        System.out.println("Strip payment service in the class.");
        return payment;
    }

}
