package org.mylife.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebSecurity // We don't create Bean class here
//@Profile("production")
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter
public class SecurityConfiguration 
{
	// Authentication
//	@Override
//	public void configure(AuthenticationManagerBuilder auth) throws Exception
//	{
//		auth.inMemoryAuthentication()
//					.withUser("vimal")
//					.password("krishna")
//					.roles("USER","ADMIN");
//	}
//	
//	
//	// Authorization
//		@Override
//		public void configure(HttpSecurity http) throws Exception
//		{
//			// http.antMatcher("/**").csrf().disable().authorizeRequests()
//			http.antMatcher("/**").authorizeRequests()
//						.anyRequest().hasRole("USER")
//						
//						.and()
//						
//						.formLogin().loginPage("/login.jsp")
//									.failureUrl("/login.jsp?error=1")
//									.loginProcessingUrl("/login")
//									.permitAll()
//									.and()
//									.logout()
//									.logoutSuccessUrl("/webapp/autos/list.html");
//		}
//	
}
