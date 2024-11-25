package com.login_logoutApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.login_logoutApi.Entity.User;
import com.login_logoutApi.Repository.UserRepository;


@Service
public class AuthService {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User register(User user) {
        user.setPass(passwordEncoder.encode(user.getPass()));
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPass())) {
            return user;
        }
        return null;
    }
}
