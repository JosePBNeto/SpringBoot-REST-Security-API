package com.luv2code.springboot.cruddemo.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager SecurityConfig() {

        UserDetails neto = User.builder()
                .username("neto")
                .password("{noop}neto123")
                .roles("EMPLOYEE")
                .build();

        UserDetails lula = User.builder()
                .username("lula123")
                .password("{noop}neto123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails juliana = User.builder()
                .username("juliana")
                .password("{noop}juliana123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(neto, lula, juliana);
    }
}
