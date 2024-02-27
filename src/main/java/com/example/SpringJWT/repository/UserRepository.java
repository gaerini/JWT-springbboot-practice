package com.example.SpringJWT.repository;

import com.example.SpringJWT.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}
