package com.mysite.sbb.user;

import lombok.Getter;

@Getter

public enum UserRole {
	
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");
	
	private UserRole(String value) {
		this.value = value;
	}
	
	private String value; //private만 가능, 외부에서 접근하면 안되기 때문
}
