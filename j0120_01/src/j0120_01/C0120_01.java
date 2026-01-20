package j0120_01;

import java.util.Scanner;

public class C0120_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte + byte	= int
//		short + short = int
//		char + char = int
//		int + int = int
//		long + int = long
//		float + int = float
//		float + long = float
//		double + float = double
		
//		증감연산자는 타입 변환이 없음 ++i
		
		// 문자 숫자타입을 숫자타입으로 변경
		int no = '2' - '0';
//		System.out.println(no);
		
		// 숫자를 문자로 변경
		char ch = (char)(2 + '0');
//		System.out.println(ch);
		
		// String타입 -> char타입 변경
		String str = "123";
		char str2 = str.charAt(0);
		
		// 숫자타입 -> 문자열타입
		String str3 = 234 + "";
		
		// 문자열타입 -> int타입
		String str4 = "20";
		int num1 = Integer.parseInt(str4);
		String str5 = "10";
		int num2 = Integer.parseInt(str5);
//		System.out.println(str4+str5);
//		System.out.println(num1+num2);
		
			
		// 랜덤숫자를 입력하는데, 중복이 없도록 숫자를 입력

		int no1 = (int)(Math.random()*3)+1;
		int no2 = 0;
		int no3 = 0;
		
		for(;;) {
			no2 = (int)(Math.random()*3)+1;
			no3 = (int)(Math.random()*3)+1;
			
			if(no1 != no2 && no1 != no3 && no2 != no3) break;
		}
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1. 학생성적입력");
//		System.out.println("2. 학생성적출력");
//		System.out.println("3. 학생성적수정");
//		
//		int choice = scanner.nextInt();
//		switch(choice) {
//		case 1:
//			System.out.println("학생성적입력");
//			break;
//		case 2:
//			System.out.println("학생성적출력");
//			break;
//		case 3:
//			System.out.println("학생성적수정");
//			break;
//		default:
//			break;
//		}
	}

}
