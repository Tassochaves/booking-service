package com.dev.booking_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.booking_service.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
