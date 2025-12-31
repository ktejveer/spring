package com.eazybytes.eazyschool.config;

import org.springframework.boot.security.autoconfigure.web.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest().permitAll());
        http.csrf(csrf-> csrf.ignoringRequestMatchers("/saveMsg").ignoringRequestMatchers("/h2-console/**")).authorizeHttpRequests(authorizeRequests -> authorizeRequests
//                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/holidays/**").authenticated()
                .requestMatchers("/home").authenticated()
                .requestMatchers("/h2-console/**").permitAll()
//                .requestMatchers("/saveMsg").authenticated()
                )
                .headers(headers-> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin))
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("12345")
                .roles("ADMIN", "USER")
                .build();

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }

}
