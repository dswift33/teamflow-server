package com.david_swift.teamflow_server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
//    @Bean
//    HttpSecurity httpSecurity(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .mvcMatchers("/api/auth/**").permitAll()
//                .anyRequest().authenticated();
    }
