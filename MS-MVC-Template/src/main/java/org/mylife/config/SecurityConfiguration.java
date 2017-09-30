package org.mylife.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity // We don't create Bean class here
@Profile("production")
public class SecurityConfiguration 
{
	// Authentication
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
					.withUser("vimal")
					.password("krishna")
					.roles("USER","ADMIN");
	}
		
	// Authorization
	// Which order to evaluate the following expressions default order is 100
	// lowest is evaluated first
	@Configuration
	@Order(2)                                                        
	public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
		protected void configure(HttpSecurity http) throws Exception {
			http
				.antMatcher("/**")                               
				.authorizeRequests()
					.anyRequest().hasRole("ADMIN")
					.and()
					.httpBasic()
					.and()
					.csrf()
					.disable(); // For POST needed
		}
	}

	// https://docs.spring.io/spring-security/site/docs/current/reference/html/jc.html
	// Form based
	@Configuration    
	@Order(1) 
	public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
	
		public void configureGlobal(HttpSecurity http) throws Exception
		{
			
			http.antMatcher("/webapp/**").authorizeRequests()
						.anyRequest().hasRole("USER")
						
						.and()
						
						.formLogin().loginPage("/webapp/login.jsp")
									.failureUrl("/webapp/login.jsp?error=1")
									.loginProcessingUrl("/webapp/login")
									.permitAll()
									.and()
									.logout()
									.logoutSuccessUrl("/webapp/autos/list.html");
		}
	}// static class
}
