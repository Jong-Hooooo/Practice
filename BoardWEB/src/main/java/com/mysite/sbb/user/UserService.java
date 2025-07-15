package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;
import com.mysite.sbb.question.QuestionService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserService {

    private final QuestionService questionService;

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

  
	
	public SiteUser create(String username, String email, String password) {
		SiteUser user = new SiteUser();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		this.userRepository.save(user);
		return user;
	}
	
		
		public SiteUser getUser(String username) {
			
			Optional<SiteUser> siteUser = this.userRepository.findByUsername(username);
			
			if(siteUser.isPresent()) {
				return siteUser.get();
			}else {
				throw new DataNotFoundException("사용자를 찾을 수 없습니다.");
			}
			
		
		
		
	}
	
}
