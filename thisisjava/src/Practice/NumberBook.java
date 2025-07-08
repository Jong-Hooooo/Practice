package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class NumberBook {

	public static void main(String[] args) {

		HashMap<String, String> numberBook = new HashMap<>();

		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.번호 등록");
			System.out.println("2.번호 조회");
			System.out.println("3.전체 목록 출력");
			System.out.println("4.종료");
			System.out.println("메뉴 선택");
			String num = scanner.nextLine();

			if (num.equals("1")) {
				System.out.print("이름 : ");
				String name = scanner.nextLine();
				String dupName = name;
				int i = 1;
				while (numberBook.containsKey(dupName)) {
					dupName = name + "(" + i + ")";
					i++;
				}
				System.out.print("번호 : ");
				String number = scanner.nextLine();
				numberBook.put(name, number);
				System.out.println(dupName + "님의 전화번호가 등록이 되었습니다");
				
			}

			if (num.equals("2")) {
				System.out.println("번호 목록 조회");
				System.out.println("이름 : ");
				String wantName = scanner.nextLine();
				Set<String> keyName = numberBook.keySet();
				Iterator<String> itKeyName = keyName.iterator();
				while(itKeyName.hasNext()) {
					String K = itKeyName.next();
//					if(K.contains(wantName)) {
//						System.out.println(K + " : " + numberBook.get(K));
//					}
					if(K.startsWith("우")) {
						System.out.println(K + " : " + numberBook.get(K));
					}
				}	
			}

			if (num.equals("3")) {
				System.out.println("전체 목록 출력");

				Set<String> allList = numberBook.keySet();
				Iterator<String> allListIt = allList.iterator();
				while(allListIt.hasNext()) {
					String K = allListIt.next();
					String V = numberBook.get(K);
					System.out.println(K + " : " + V);
				}
//				for(String name2 : numberBook.keySet()) {
//					System.out.println(name2 + ":" + numberBook.get(name2));
//				}
			}

			if (num.equals("4")) {
				System.out.println("종료");
				run = false;
			}
		}
	}
}

//중복된 이름이면 저장 X

