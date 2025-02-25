package com.fawry.E_commerce.repository;

import com.fawry.E_commerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}