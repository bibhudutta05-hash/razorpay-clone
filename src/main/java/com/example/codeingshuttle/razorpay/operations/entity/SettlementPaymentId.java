package com.example.codeingshuttle.razorpay.operations.entity;


import jakarta.persistence.*;

import java.util.UUID;

@Embeddable
public class SettlementPaymentId {

    private UUID settlementId;

    private UUID paymentId;
}
