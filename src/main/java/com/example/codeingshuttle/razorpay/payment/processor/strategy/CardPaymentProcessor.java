package com.example.codeingshuttle.razorpay.payment.processor.strategy;

import com.example.codeingshuttle.razorpay.payment.processor.PaymentProcessor;
import com.example.codeingshuttle.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.example.codeingshuttle.razorpay.payment.processor.dto.PaymentProcessorResponse;

public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}

