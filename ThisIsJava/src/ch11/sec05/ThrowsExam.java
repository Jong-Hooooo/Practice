package ch11.sec05;

public class ThrowsExam {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}

	}
	public static void findClass() throws ClassNotFoundException{
		Class.forName("Java.lang.String2");
	}

}
