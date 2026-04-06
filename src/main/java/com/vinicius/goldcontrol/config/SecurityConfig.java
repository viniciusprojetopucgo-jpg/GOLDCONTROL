package com.vinicius.goldcontrol.config;

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
            .csrf(csrf -> csrf.disable()) // Desabilitado para facilitar os testes iniciais de POST
            .authorizeHttpRequests(auth -> auth
                // Libera o catálogo, as imagens das joias e o CSS para os clientes
                .requestMatchers("/catalogo.html", "/imagens/**", "/css/**").permitAll()
                // Exige login para o index.html (painel administrativo) e APIs de controle
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                // Após o login com sucesso, vai direto para o painel de gestão
                .defaultSuccessUrl("/index.html", true)
                .permitAll()
            )
            .logout(logout -> logout.permitAll());

        return http.build();
    }
}