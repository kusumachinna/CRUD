package com.crud.crud.operations.repository;

import com.crud.crud.operations.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}