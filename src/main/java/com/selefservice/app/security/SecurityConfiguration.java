package com.selefservice.app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth
					.inMemoryAuthentication()
					.withUser("admin").password("admin123").roles("ADMIN")
					.and()
					.withUser("jouhs").password("a123").roles("USER");
			}

}
