package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PhoneNum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> phoneBook = new HashMap<String, String>();
//		List<String> list = new ArrayList<String>();

		
		System.out.println("===========전화번호부 프로그램==========");
		
		for(int i = 0; i < 100; i++){
			System.out.println("1. 번호 등록 \n2. 번호 조회 \n3. 전체 목록 출력 \n4.종료");
			System.out.println("메뉴 선택: ");
			String choice = scanner.nextLine();
			
			if(choice.equals("1")) {
				System.out.println("이름 입력: ");
				String baseName = scanner.nextLine();
				String name = baseName;
				
				int count = 1;
				while(phoneBook.containsKey(name)) {
					name = baseName + "(" + count + ")";
					count++;
				}
				System.out.println("전화번호 입력: ");
				String phoneNum = scanner.nextLine();
				
				if(phoneBook.containsValue(phoneNum)){
					System.out.println("이미 저장된 전화번호입니다.");
				}else {
				phoneBook.put(name, phoneNum);
				System.out.println(name + "님의 전화번호가 저장되었습니다");
				}
				System.out.println();
				
			}else if(choice.equals("2")) {  //숫자로 하면 같은 2라 헷갈려서 인식이 그렇게 되는 
				System.out.println("검색할 이름 입력: ");
				String name = scanner.nextLine();
				
				if(!phoneBook.containsKey(name)) {  //true로 인식해서 이거 거쳐서나가서 동시에 출력되는
					System.out.println("등록되지 않은 이름입니다.");
				}
				
				Set<String> keySet = phoneBook.keySet();
				Iterator<String> keyIterator = keySet.iterator();
				while(keyIterator.hasNext()) {
					String n = keyIterator.next();
					String p = phoneBook.get(n);
					if(n.startsWith(name)) {
						System.out.println(n + ": " + p);	
					}
				}
				System.out.println();
							
//				String phoneNum = phoneBook.get(name);       //if(phoneBook.containsKey(name)){
//				System.out.println(name + ": " + phoneNum);
//				System.out.println();
				
			}else if(choice.equals("3")) {
				Set<Entry<String, String>> entrySet = phoneBook.entrySet();
				Iterator<Entry<String, String>> entryIterator = entrySet.iterator();
				while(entryIterator.hasNext()) {
					Entry<String, String> entry = entryIterator.next();
					String name = entry.getKey();
					String phoneNum = entry.getValue();
					System.out.println(name + ": " + phoneNum);
				}
				System.out.println();
				
			}else if(choice.equals("4")) {
				System.out.println("종료");
				break;
			}
		}
	}
}
