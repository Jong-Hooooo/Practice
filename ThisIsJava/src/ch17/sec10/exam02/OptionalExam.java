package ch17.sec10.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법 1_평균: " + optional.getAsDouble());
		}else {
			System.out.println("방법 1_평균: 0.0");
		}
		
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법 2_평균: " + avg);
		
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법 3_평균: " + a));
	}

}
