package com.example.NebulaMusic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/index", "/iniciar-sesion",
                                "/registro", "/crear-cuenta", "/autenticacion",
                                "/static/**", "/css/**", "/js/**",
                                "/images/**", "/styles/**").permitAll()
                        .anyRequest().permitAll()
                );
        return http.build();
    }
}