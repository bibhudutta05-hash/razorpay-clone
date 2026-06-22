package com.example.codeingshuttle.razorpay.merchant.repository;

import com.example.codeingshuttle.razorpay.merchant.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
}
