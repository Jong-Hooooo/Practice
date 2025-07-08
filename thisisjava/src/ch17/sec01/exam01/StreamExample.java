package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		//향상 for문 사용
//		for(String s : set) {
//			System.out.println(s);
//		}
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
