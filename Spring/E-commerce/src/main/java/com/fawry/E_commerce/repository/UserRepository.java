package com.fawry.E_commerce.repository;

import com.fawry.E_commerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
