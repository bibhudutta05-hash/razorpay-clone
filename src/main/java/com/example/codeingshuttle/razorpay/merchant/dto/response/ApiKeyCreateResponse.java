package com.example.codeingshuttle.razorpay.merchant.dto.response;

import com.example.codeingshuttle.razorpay.common.enums.Environment;

import java.util.UUID;

public record ApiKeyCreateResponse(
        UUID id,
        String keyId,
        String keySecret,
        Environment environment
) {
}