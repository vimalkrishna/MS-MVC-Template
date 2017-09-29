package org.mylife.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Fluent Interface to call series of methods
		// auth.jdbcAuthentication(); Can be done with database authentication
		auth.inMemoryAuthentication()
			.withUser("vimal")
			.password("krishna")
			.roles("USER","ADMIN");
	}

	// Authorization, any request must have role USER
		@Override
		public void configure(HttpSecurity http) throws Exception
		{
			http.antMatcher("/**").authorizeRequests()
						.anyRequest().hasRole("USER")
						
						.and()
						
						.formLogin().loginPage("/login.jsp")
									.failureUrl("/login.jsp?error=1")
									.loginProcessingUrl("/login")
									.permitAll()
									.and()
									.logout()
									.logoutSuccessUrl("/webapp/autos/list.html");
		}
	
}
