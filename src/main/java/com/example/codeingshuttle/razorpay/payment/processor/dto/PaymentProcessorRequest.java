package com.example.codeingshuttle.razorpay.payment.processor.dto;

import com.example.codeingshuttle.razorpay.common.entity.Money;
import com.example.codeingshuttle.razorpay.common.enums.PaymentMethod;

import java.util.Map;

public record PaymentProcessorRequest(
        PaymentMethod method,
        Money amount,
        Map<String, Object> methodDetails
) {
}
