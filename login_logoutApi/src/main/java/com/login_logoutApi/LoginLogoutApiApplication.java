package com.login_logoutApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.login_logoutApi.Entity")
@ComponentScan(basePackages = {"com.login_logoutApi"})
@EnableJpaRepositories(basePackages = "com.login_logoutApi.Repository")
public class LoginLogoutApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginLogoutApiApplication.class, args);
		System.out.println("run");
	}

}
