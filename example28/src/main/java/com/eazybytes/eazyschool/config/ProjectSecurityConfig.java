package com.eazybytes.eazyschool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf-> csrf.disable()).authorizeHttpRequests(authorizeRequests -> authorizeRequests
//                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/holidays/**").authenticated()
                .requestMatchers("/home").authenticated()
//                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/saveMsg").authenticated());

        return http.build();
    }

}
