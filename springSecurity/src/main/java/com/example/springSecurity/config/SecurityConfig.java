package com.example.springSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity(debug=true)
@EnableMethodSecurity
public class SecurityConfig {
	
	private final AuthenticationProvider authenticationProvider;
    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    public SecurityConfig(
        JwtAuthenticationFilter jwtAuthenticationFilter,
        AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

//	Basic Security
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//		http.csrf(csrf->csrf.disable())
//		.authorizeHttpRequests((authorize)->authorize
//				.requestMatchers("/product/**").permitAll()
//				.requestMatchers("/admin-page").hasRole("Admin")
//				.requestMatchers("/index").hasAnyRole("USER","Admin")
//				.anyRequest().authenticated())
//				.httpBasic(httpBasic->httpBasic.realmName("MyApp"));
//		     return http.build();    
//	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf->csrf.disable())
				.authorizeHttpRequests((authorize)->authorize
				.requestMatchers("/auth/**").permitAll()
				.requestMatchers("/register/**").permitAll()
//				.requestMatchers("/admin-page").hasRole("Admin")
//				.requestMatchers("/index").hasAnyRole("USER","Admin")
				.anyRequest().authenticated())
		
		         .sessionManagement(session -> session
		                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		         //.and()
		         .authenticationProvider(authenticationProvider)
		         .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
				 .headers(headers -> headers
			     .httpStrictTransportSecurity(hsts -> hsts.disable()));
		     return http.build();  
		     
		     
	}
	
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user=User.builder()
//				.username("Gayatri")
//				//.password("{noop}pass123")
//				//.password("{bycrypt}$2a$12$5gQcM//PjY/543SlVhISyO9biL9RM86sHDKS0GItdJz/O7/RbFec2")
//				.password("$2a$12$5gQcM//PjY/543SlVhISyO9biL9RM86sHDKS0GItdJz/O7/RbFec2")
//				.build();
//		
//		return new InMemoryUserDetailsManager(user);
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
}
