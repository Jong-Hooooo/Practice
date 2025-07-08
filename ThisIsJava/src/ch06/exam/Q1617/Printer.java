package ch06.exam.Q1617;

public class Printer {

	void printIn(int x){}
	void printIn(boolean result) {}
	void printIn(double y) {}
	void printIn(String name) {}
	
	
	
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		printer.printIn(10);
		printer.printIn(true);
		printer.printIn(5.7);
		printer.printIn("홍길동");
	}

}
