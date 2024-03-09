package com.microservicesapp.userservice.userRepository;

import com.microservicesapp.userservice.userEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
