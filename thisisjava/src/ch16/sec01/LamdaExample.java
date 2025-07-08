package ch16.sec01;

public class LamdaExample {

	public static void main(String[] args) {
		
		action((x , y)->{
			int result = x + y;
			System.out.println("result : " + result);
		});
		
		action((x , y)->{
			int result1 = x - y ;
			System.out.println("resul1 : " + result1);
		});

	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		
		calculable.calculate(x, y);
		
	}

}
