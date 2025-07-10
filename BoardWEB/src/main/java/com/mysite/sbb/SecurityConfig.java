package com.mysite.sbb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration // 설정 파일
@EnableWebSecurity // URL을 통해 들어오는 모든 요청에 스프링 시큐리티를 활성화 기본설정은 자동으로 설정 내가 필요하다면 커스터마이징 가능

public class SecurityConfig {

	@Bean // 객체 생성
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests // URL 경로별로 접근 권한을 설정
				.requestMatchers(new AntPathRequestMatcher("/**")).permitAll()) // requestMatchers로 설정한 경로는 인증없이 누구나 접근
																				// 가능하도록 허용
				.formLogin(formLogin -> formLogin 
				.loginPage("/user/login")
				.defaultSuccessUrl("/")
		// authorizeHttpRequsets URL경로별 접근 권한 설정
		// permitAll() requestMatchers로 설정한 경로는 인증없이 누구나 접근 가능하도록 허용

		);

		return http.build(); // 반드시 반환해야함
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
		throws Exception{
		return authenticationConfiguration.getAuthenticationManager();
	}
	
}
