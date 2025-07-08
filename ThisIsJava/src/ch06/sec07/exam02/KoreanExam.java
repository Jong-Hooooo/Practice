package ch06.sec07.exam02;

public class KoreanExam {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("성아영", "123456-4567910");
		
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("성열현", "123456-7891234");
		
		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
		}
	}

