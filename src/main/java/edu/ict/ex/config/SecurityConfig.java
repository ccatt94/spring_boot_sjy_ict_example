package edu.ict.ex.config;


import java.beans.Customizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.ict.ex.security.CustomUserDetailsService;

@Configuration //@Component + 설정 
@EnableWebSecurity //필터 등록 = 시큐리티 설정 파일이다 라고 알려주는 역활
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
   
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	//정적 리소스 폴더 처리
   @Override
   public void configure(WebSecurity web) throws Exception{
      
      //web.ignoring().regexMatchers(PathRequest.toStaticResources().atCommonLocations());
      web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/lib/**"); //해당 폴더 접근은 막지 말라는 명령
      //web.ignoring().antMatchers("/**"); //모든 폴더 접근
   }
   
   
   //권한 설정
   @Override
   protected void configure(HttpSecurity http) throws Exception {
      //우선 CSRF설정을 해제한다.
      //초기 개발시만 해주는게 좋다.
	   
      //http.csrf(csrf -> csrf.disable());
      
      http.authorizeHttpRequests()
      .antMatchers("/board/**").hasAnyRole("USER") 
          
      // 관리자용 페이지 처리시 사용
      .antMatchers("/boards/**").hasAnyRole("ADMIN")
      
      //다른 페이지는 모든 사용자 허용
      .antMatchers("/**").permitAll();

      //로그인 폼 커스터마이징(login.jsp에 있는 input 안에 name들과 맞춰야됨)
     /* http.formLogin() //스프링 시큐리티에 있는 기본 로그인 폼을 사용하겠다.
      	  .loginPage("/Eshopper/login2") //loginPage() 는 말그대로 로그인할 페이지 url 이고
      	  .usernameParameter("id")
      	  .passwordParameter("pw")
      	  .defaultSuccessUrl("/Eshopper/index");
      System.out.println("작동함");
      */
      	  //.permitAll(); //모든 유저가 로그인 화면은 볼 수 있게 한다
      
      //로그인 폼 커스터마이징(login.jsp에 있는 input 안에 name들과 맞춰야됨)
      http.formLogin() //스프링 시큐리티에 있는 기본 로그인 폼을 사용하겠다.
      .loginPage("/login") //loginPage() 는 말그대로 로그인할 페이지 url 이고
      .usernameParameter("id")
      .passwordParameter("pw")
      .defaultSuccessUrl("/");
      //.permitAll(); //모든 유저가 로그인 화면은 볼 수 있게 한다
      
      
   }

   
   //테스트용 유저 등록=인메모리 방식
   @Override
   public void configure(AuthenticationManagerBuilder auth) throws Exception{
	   
	   //auth.inMemoryAuthentication()
	   //.withUser("user").password("{noop}user").roles("USER")
	   //.and()
	   //.withUser("admin").password("{noop}admin").roles("ADMIN")
	   //.and()
	   //.withUser("manager").password("{noop}manager").roles("MANAGER");
	   
	   auth.userDetailsService(customUserDetailsService)
	   	   .passwordEncoder(passwordEncoder());
	   
   }
   
   @Bean
   public PasswordEncoder passwordEncoder() {        
     return new BCryptPasswordEncoder(); //암호화 모듈(평문 암호화)
   }
   
   

}