package ch17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ch17.sec12.exam01.Student;

public class CollectExam {

	public static void main(String[] args) {

		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		Map<String, List<Student>> map = totalList.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex())
				);
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		List<Student> femalList = map.get("여");
		femalList.stream().forEach(s -> System.out.println(s.getName()));
	}
}
