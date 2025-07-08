package ch15.sec02.exam01;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//저장되어 있는 전체 객체 수 
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		//2번째 인덱스 값을 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + " " + board.getContent() + " " + board.getWriter());
		
		System.out.println();
		
		//모든 객체 한개씩 가져와 출력
		for(int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+ " " + b.getContent() + " " + b.getWriter());
			
		}
		
		System.out.println();	
		
		//객체 삭제
		list.remove(2);
		
		//향상 for문으로 모든 객체 한개씩 가져와 출력
		for(Board b : list) {
			System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
		}
		
	}

}
