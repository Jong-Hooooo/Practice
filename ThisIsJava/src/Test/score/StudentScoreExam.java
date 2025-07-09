package Test.score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentScoreExam {

	public static void main(String[] args) {
	
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("이영희", 92));
		stuList.add(new Student("최지우", 92));
		stuList.add(new Student("김철수", 85));
		stuList.add(new Student("박민수", 78));
		stuList.add(new Student("장보고", 65));
		
		//1.점수가 80점 이상인 학생의 이름만 출력  //못 풀은 부분
		List<String> highScoreStu = stuList.stream()
				.filter(s -> s.getScore() >= 80)
				.map(Student :: getName)
				.collect(Collectors.toList());
		System.out.println("80점 이상 학생: " + " [" + highScoreStu + "]");
		
//		Map<String, List<Student>> map = stuList.stream()
//				.collect(
//						Collectors.groupingBy(s -> s.getScore())
//				);
//		List<Student> highScoreList = map.get(s >= 80);
//		highScoreList.stream().forEach(n -> System.out.println(n.getName()));
	
			
		//2.평균점수 계산
		//방법 1  //선생님 ver.1
//		OptionalDouble avg = stuList.stream()
//				.mapToInt(Student :: getScore)
//				.average();
//		System.out.println("평균 점수: " + (avg.isPresent() ? String.format("%.2f", avg.getAsDouble()) : "없음"));
		
		//방법 2  //선생님 ver.2
		OptionalDouble avg = stuList.stream()
				.mapToInt(Student :: getScore)
				.average();
		
		if(avg.isPresent()) {
			double average = avg.getAsDouble();
			double rounded = Math.round(average * 100) / 100.0;
			System.out.println("평균점수: " + rounded);
		}else {
			System.out.println("평균점수: 없음");
		}
		
		//방법 3  //내 버
//		double avg = stuList.stream()
//				.mapToInt(student -> student.getScore())
//				.average()
//				.getAsDouble();
//		
//		System.out.println("평균 점수: " + avg);
		
				
		//3.점수를 기준으로 내림차순 정렬 toString
		//내 버전
//		System.out.println("점수 내림차 순 정렬:");
//		stuList.stream()
//			.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
//			.forEach(s -> System.out.println(s.getName() + " (" + s.getScore() + ")"));
		
		//선생님 버전
		 List<Student> sortedDesc = stuList.stream()
                 .sorted(Comparator.comparingInt(Student::getScore).reversed())
                 .collect(Collectors.toList());
         System.out.println("점수 내림차순 정렬:");
         sortedDesc.forEach(System.out::println);  //많이 안 쓰는 표현이므로 stream으로 바꿔서 표현
		
		//4. 최고 점수 받은 학생 이름 출력 (동점자 포함)  //못 풀은 부분
         int maxScore = stuList.stream()
                 .mapToInt(Student::getScore)
                 .max()
                 .orElse(-1);
         List<String> topStudents = stuList.stream()
                 .filter(s -> s.getScore() == maxScore)
                 .map(Student::getName)
                 .collect(Collectors.toList());
         System.out.println("최고 점수 학생: " + topStudents + " (점수: " + maxScore + ")");
     }
//		List<String> topStudents = 
		
//		System.out.println("최고 점수 학생: [" + name + "] (점수: " + score + ")");
				

}



