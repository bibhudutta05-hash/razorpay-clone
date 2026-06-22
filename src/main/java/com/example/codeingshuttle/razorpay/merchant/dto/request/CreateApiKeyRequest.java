package com.example.codeingshuttle.razorpay.merchant.dto.request;

import com.example.codeingshuttle.razorpay.common.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) {
}