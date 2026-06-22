package com.example.codeingshuttle.razorpay.payment.service;

import com.example.codeingshuttle.razorpay.payment.dto.request.CreateOrderRequest;
import com.example.codeingshuttle.razorpay.payment.dto.response.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);
}
