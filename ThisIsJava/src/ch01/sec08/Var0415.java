package ch01.sec08;

import java.util.Scanner;

public class Var0415 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x = " + x + ", y = " + y);
		
		int temp = x;  // temp 3, x = 3
		y = x;         // x= 5, y = 5
		y = temp;	   // temp = 3, y = 3
		System.out.println("x = " + x + ", y = " + y + " temp = " + temp);
		
		//자바 데이터타입 7개 (범위의 차이)
		//정수 byte(-128~127), char(3만 2천여개), int(1조 미만의 일반 숫자), long(숫자 제한 x), short
		//실수 float, double(더 많은 숫자 가능)
		//논리 boolean(true or false를 구분할 때 -> ex)여자인가? 예. / 남자인가? 아니오.)
		
		//정수 타입
		byte var1 = -128;
		byte var2 = 127;
		
		int var3 = 10;
		long var4 = 10L;

		int var5 = 100000;
		long var6= 100000000L;
		//long 타입의 데이터는 숫자 뒤에 'L'을 붙여야 한다. L이 없으면 int로 간주해 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		//참조 타입 string(문자)
		
		//문자 타입
		//ascll a = 65, b = 66, ...(외울 필요 x)
		//char 타입은 문자를 숫자로 바꾼 것
		//char 타입 문자에 ' ' 없으면 오류 / ""은 문자에만 넣는거기 때문에 char 타입에는 ""하면 에러 발생
		char v1 = 65;
		char v2 = 'A';
		
		System.out.println(v1);
		System.out.println(v2);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		//실수 타입
		//float 타입에는 'f'를 꼭 붙여줘야 한다.
		float var10 = 0.123456789f;
		double var11 = 0.123456789;
		
		System.out.println(var10);
		System.out.println(var11);
		
		//논리 타입
		int z = 10;
		boolean result = z == 10;	//(대답이 true or false가 나오게 유도) z가 10이랑 같아요? -> 물어보는 조건이 한개
		// ==(같다)가 =(대입)보다 먼저 연산된다
		// '=='는 같다는 의미, '='는 대입의 의미이지만 둘 다 연산이므로 연산 순어에 의해 에러가 나지 않도록 먼저 연산해야하는 값을 '()' 표시해준다.
		// !=(같지 않다) / > (크다) / < (작다) / >= (크거나 같다) / <= (작거나 같다)
		System.out.println(result);
		
		boolean result1 = x != 10;	// -> 물어보는 조건이 한개
		System.out.println(result1);
		
		boolean result2 = x >= 20;
		System.out.println(result2);	// x가 20보다 크거나 같아요 -> '크거나 같아요'는 물어보는 조건이 한개
		
		// x가 가지고 있는 값이 0보다 크고 20보다 작은지 물어보고 싶어요 -> 물어보는 조건이 두개(~고)
		// 조건이 두개 이상의 조건을 모두 만족하는지 물어볼때는 'and'를 쓴다 (~고, ~이면서) 자바에서는 &&	ex) x > 0, x < 20
		// 조건이 여러개 일때 조건중에 하나만 만족해도 되면 'or'(또는, ~이거나)		   자바에서는 ||
		boolean result3 = x > 10 && x < 20;
		System.out.println(result3);
		
		boolean result4 = x > 10 || x < 20;
		System.out.println(result4);
		
		//문자열 타입
		String name = "성아영";
		String job = "프로그래머";
		System.out.println(name); // print는 줄 바꿎 않음  println은 줄 바꾸기
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다";		//""안에 ""를 또 넣을 순 없다 -> 안쪽 "" 각각의 앞에 \를 넣으면 활용 가능 ex)"~\"\"~"
		System.out.println(str);
		
		System.out.println("나는\n");		//'\n' 줄 바꾸기 (println과 구분)
		System.out.println("자바를\n");
		System.out.println("배웁니다");
		
		//문자열 기본 타입 변환
		//+실제로 더하는 연산
		//+앞뒤로 붙이는 연결 연산자	/결합 연산자
		String result5 = 10 + "2" + 5;
		System.out.println(result5);		//1025로 값이 나옴
		
		//기본 타입 7개끼리는 숫자로 자유지만 참조인 String은 문자이기 때문에
		String str1 = "10";		//문자 10
		System.out.println(str1 + 10);		//문자 + 숫자 = 1010
		
		byte byteValue = Byte.parseByte(str1);
		System.out.println(byteValue + 10);		//숫자 + 숫자 = 20
		
		String str2 = "10";
		short shortValue = Short.parseShort(str2);
		System.out.println(shortValue + 10);
		
		String str3 = "10";
		long longValue = Long.parseLong(str3);
		System.out.println(longValue + 10);
		
		String str4 = "3.14";
		double doubleValue = Double.parseDouble(str4);
		System.out.println(doubleValue + 1.0);
		
		String str5 = "10";
		int intValue = Integer.parseInt(str5);
		System.out.println(intValue);
		
		//변수 사용 범위
		int v3 = 15;
		int v4 = 0;		//if 블록 안에 있는 v4를 밖의 v5에 적용시키면 에러가 나니까 위의 메인 블록에서 값이 없게 미리 선언하면 뒤의 v5에도 적용 가능
		
		if (v3 > 10) {	//만약에 대답은 반드시 true or false
			v4 = v3 - 10;	//if의 대답이 true일때 실행		// v4 =5
			//원래 int v4 = v3 - 10; 이나 v5에 v4를 적용시키기 위해 위에 메인 블록에서 선언했으므로 데이터 타입을 제외한 나머지를 적어준다(다시 선언하면 에러)
			//여기 if 블록 안에서 v4를 선언한다면 밖에서 적용 x -> 에러
			System.out.println(v4);
		}
		
		System.out.println("출력값이 없습니다.");		//	if블록 밖이므로 if블록과 상관없이 출력
		int v5 = v3 + v4 + 5;	//25
		System.out.println(v5);

		
		//if(조건문) {단, if 블록 안의 조건문은 대답이 true or false로만 나올 수 있어야 한다
		//true 일때 실행할 값
		//}
		
		
		//키보드 입력 데이터를 변수에 저장
		Scanner scanner = new Scanner(System.in);	//콘솔 창에 키보드를 통해 입력하기 위해 설정
		
		System.out.println("X값 입력 : ");
		
		String strX = scanner.nextLine();	//콘솔 창에 키보드를 통해 입력한 값을 입력한 뒤 Enter -> 무조건 문자 취급!
		
		System.out.println(strX + 10);		//strX 5	510
		
		int X = Integer.parseInt(strX);		//x	5
		//문자 X를 숫자 X로 변경
		
		System.out.println(x + 10);		//5 + 10  15
		
		System.out.println("Y값 입력 : ");
		String strY = scanner.nextLine();
		//문자 Y를 숫자 Y로 변경
		System.out.println(y);
		
		int result6 = x + y;
		System.out.println("x + y : " + result6);
		System.out.println(result6);
		
		while(true) {		//	While : 조건의 true면 계속 반복(반복문)
			System.out.println("입력 문자열 : ");
			String data = scanner.nextLine();
			if(data.equals("q")) {	//equals : '참조타입'의 변수가 가지고 있는 값이 같냐고 물어볼때   //== : 기본타입'의 변수가 가지고 있는 값이 같냐고 물어볼
				break;				//if문이 속해 있는 '반복문'을 빠져나감 (종료)
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		
	}

}
