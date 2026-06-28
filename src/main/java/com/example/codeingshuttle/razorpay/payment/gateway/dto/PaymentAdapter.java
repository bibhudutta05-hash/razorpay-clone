package com.example.codeingshuttle.razorpay.payment.gateway.dto;

public interface PaymentAdapter {

    PaymentResult initiate(PaymentRequest request);
}