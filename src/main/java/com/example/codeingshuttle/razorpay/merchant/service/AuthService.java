package com.example.codeingshuttle.razorpay.merchant.service;

import com.example.codeingshuttle.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.example.codeingshuttle.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);
}
