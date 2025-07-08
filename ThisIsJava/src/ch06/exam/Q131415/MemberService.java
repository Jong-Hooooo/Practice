package ch06.exam.Q131415;

import java.lang.reflect.Member;

public class MemberService {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
			
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
	}

//	boolean login(String id, String password) {
//		if(true) {
//			System.out.println("로그인이 되었습니다.");
//			memberService.logout("hong");
//		}else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//			return false;
//		}
//	}
//
//	void logout(String id) {
//		
//	}

	}

