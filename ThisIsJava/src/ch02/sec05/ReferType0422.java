package ch02.sec05;

public class ReferType0422 {

	public static void main(String[] args) {
		// 문자열 길이
		String ssn = "0104121230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
		//문자열 대체
		String oldstr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newstr =  oldstr.replace("자바","JAVA");
		System.out.println(oldstr);
		System.out.println(newstr);
		
		String newstr2 = newstr.replace("자바", "파이썬");
		System.out.println(newstr2);
		
		String newstr3 = newstr.replace("파이썬", "객제프로그래밍");
		System.out.println(newstr3);
		
		//문자열 잘라내기
		String ssn1 = "880815-1234567";
		
		String firNum = ssn1.substring(0, 6);
		System.out.println(firNum);
		String secNum = ssn1.substring(7);
		System.out.println(secNum);
		
		//문자열 찾기
		//contains : true or false로 문자 직접 찾기(일부만 일치해도 찾아줌)
		//equals : 완벽히 일치한 것 찾아줌
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련된 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		//문자열 분리
		String board = "1,자바 학습,참조 타입 String을 학습합니다,성아영";
		
		String[] tokens = board.split(",");
		System.out.println("번호 : " + tokens[0]);
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);
		
		System.out.println();
		
		for(int i = 0; i < tokens.length; i++) {
			System.out.println("for문으로 반복 : " + tokens[i]);
		}
		int num = tokens.length;
		System.out.println(num);
	}

}
