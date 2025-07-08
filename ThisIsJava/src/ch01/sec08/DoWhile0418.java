package ch01.sec08;

import java.util.Scanner;

public class DoWhile0418 {

	public static void main(String[] args) {
		//Do-While 
		// 조건과 상관없이 무조건 한번은 실행하는 것
		//while문->조건은 보고 실행할래
		
		
	    System.out.println("메세지를 입력하세요");
	    System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
        Scanner scanner = new Scanner(System.in);
        String inputString;
    
        do {
    	   System.out.println(">");
    	   inputString = scanner.nextLine();
    	   System.out.println(inputString);
        }while(! inputString.equals("q"));
    
        System.out.println();
        System.out.println("프로그램 종료");
    
        //break 
        //for문에는 break 잘 안씀
        while(true) {
    	   int num = (int)(Math.random() * 6) + 1;
    	   System.out.println(num);
    	   if(num == 6) {
    		   break;
    	   }
        }
        System.out.println("프로그램 종료");
        
        //continue 문
        //증감식으로 올려보내는 것
       for(int i = 1; i <= 0; i++) {
    	   if (i % 2 != 0) {
    		   continue;
    	   }
    	   System.out.println(i + " ");
    	   
       }  
    
		

	}

}
