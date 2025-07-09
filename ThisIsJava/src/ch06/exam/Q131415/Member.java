package ch06.exam.Q131415;

public class Member {
		
		String name;
		String id;
		String password;
		int age = 0;
		
		
		
		static boolean login(String id, String password) {
			if(id == "hong" && password == "12345") {     //if(id.equals "hong" && password.equals "12345") {
				return true;
			}
			return false;
				
			}
		static void logout(String id) {
				System.out.println(id + "님이 로그아웃 되었습니다.");
		}
		
		
	public static void main(String[] args) {
		
		//MemberService member = new MemberService();
		boolean result = login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}	
	}

