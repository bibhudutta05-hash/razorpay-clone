package com.example.codeingshuttle.razorpay.payment.service;

import com.example.codeingshuttle.razorpay.payment.dto.request.PaymentInitRequest;
import com.example.codeingshuttle.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentInitRequest request);
}
