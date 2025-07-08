package Test.score;

public class Student {

	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
	//못 풀은 부분
	@Override
	public String toString() {
		return name + " (" + score + "점)";
	}
}
