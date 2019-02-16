package com.springaws.servicios.serviciosartifact.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private CustomAuthenticationProvider authProvider;
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }
 
    @Override
    protected void configure(final HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeRequests().antMatchers("/javax.faces.resource/**").permitAll().anyRequest().authenticated();
        httpSecurity.formLogin().loginPage("/login.xhtml").permitAll().failureUrl("/login.xhtml?error=true");
        httpSecurity.logout().logoutSuccessUrl("/login.xhtml");
        httpSecurity.csrf().disable();
    }
     
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
