package com.spring.railway.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource myDataSource;
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(myDataSource).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/").access("permitAll")
		.antMatchers("/service").access("isAuthenticated()")
		.antMatchers("/createaccount").access("permitAll")
		.antMatchers("/createaccountmessage").access("permitAll")
		.antMatchers("/login").access("permitAll");
		http.formLogin().loginPage("/login").successForwardUrl("/loggedsuccess").failureUrl("/login?error");
		http.logout().logoutSuccessUrl("/loggedout").logoutUrl("/loggedout").invalidateHttpSession(true);
		//http.csrf().disable();
	}
}
