package com.nnk.springboot;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@EnableWebSecurity
@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter{
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Value("${spring.queries.users-query}")
//	private String usersQuery;
//
//	@Value("${spring.queries.roles-query}")
//	private String rolesQuery;
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth)
//			throws Exception {
//		auth.
//		jdbcAuthentication()
//		.usersByUsernameQuery(usersQuery)
//		.authoritiesByUsernameQuery(rolesQuery)
//		.dataSource(dataSource)
//		.passwordEncoder(bCryptPasswordEncoder);
//	}
	
//	protected void configure(HttpSecurity http) throws Exception { 
//		http
//		.authorizeRequests()
//		.antMatchers().permitAll()
//
//		.anyRequest().authenticated()
//		.and()
//		.formLogin()
//		
//		.loginPage("/app/login").failureUrl("/login?error=true")
//		.defaultSuccessUrl("/",true)
//		.usernameParameter("email")
//		.passwordParameter("password")
//		
//		
//		.and()
//		.logout()                                    
//		.permitAll();
//	}
	
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers().permitAll()
            
                .anyRequest().permitAll()
                .and()
            .formLogin()
                .loginPage("/app/login");
        
    }
	
	
}
