package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법 1 평균 : " + optional.getAsDouble());
			
		}else {
			System.out.println("방법 1 평균 : 0.0 ");
		}
		
		
	double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0);
	System.out.println("방법 2 평균 : " + avg);
	
	
	list.stream()
	.mapToInt(Integer :: intValue)
	.average()
	.ifPresent(a -> System.out.println("방법 3 평균 : " + a));
	}

}
