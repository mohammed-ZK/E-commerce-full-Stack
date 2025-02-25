package com.fawry.E_commerce.repository;

import com.fawry.E_commerce.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
