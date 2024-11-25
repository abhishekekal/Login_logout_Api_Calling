package com.login_logoutApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login_logoutApi.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
