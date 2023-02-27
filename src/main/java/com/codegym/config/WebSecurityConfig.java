package com.codegym.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {
//    @Autowired
//    private UserDetailService userDetailService;
//    @Autowired
//    private JwtEntryPoint jwtEntryPoint;
//    @Bean
//    public JwtTokenFilter jwtTokenFilter() {
//        return new JwtTokenFilter();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().csrf().disable()
//                .authorizeRequests().antMatchers("/api/auth/signup","/api/auth/login").permitAll()
//                .antMatchers("/api/auth/products").access("hasAnyRole('ADMIN','CUSTOMER')")
//                .antMatchers("/api/auth/admin").access("hasRole('ADMIN')")
//                .antMatchers("/api/auth/customer").access("hasRole('CUSTOMER')")
//                .anyRequest().authenticated()
//                .and().exceptionHandling()
//                .authenticationEntryPoint(jwtEntryPoint)
//                .and().sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.addFilterBefore(jwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
//
//
//    }
}
