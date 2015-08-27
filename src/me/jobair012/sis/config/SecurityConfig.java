package me.jobair012.sis.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter 
{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select userName, password, enabled from administrations where userName=?")
		.authoritiesByUsernameQuery("select userName, role from administrations where userName=?");
	}	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/addNewStudent").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/saveOrUpdateStudent").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/editStudent").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/deleteStudent").access("hasRole('ROLE_ADMIN')")			
			.antMatchers("/addNewResult").access("hasRole('ROLE_ADMIN')")
			.and()
				.formLogin().loginPage("/login").failureUrl("/login?error")
					.usernameParameter("userName").passwordParameter("password")
			.and()
				.logout().logoutSuccessUrl("/")
			.and()
				.csrf();
		
	}
}
