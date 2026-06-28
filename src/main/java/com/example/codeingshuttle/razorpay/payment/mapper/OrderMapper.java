package com.example.codeingshuttle.razorpay.payment.mapper;

import com.example.codeingshuttle.razorpay.payment.dto.response.OrderResponse;
import com.example.codeingshuttle.razorpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    OrderResponse toResponse(OrderRecord orderRecord);
}