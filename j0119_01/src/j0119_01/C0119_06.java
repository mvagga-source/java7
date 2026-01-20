package j0119_01;

import java.util.Scanner;

public class C0119_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
//		0.0 <= Math.random() < 1.0
//		1~10범위의 임의의 정수를 얻는 식
//		a. 0.0 * 10 <= Math.random() * 10 < 1.0 * 10;
//		b. (int)0.0 <= (int)Math.random() * 10 < (int)10.0;
//		c. 0 + 1 <= (int)Math.random() * 10 + 1 < 10 + 1;
		
//		int random_num;
////		0~9
//		random_num = (int)(Math.random()*10);
//		System.out.println(random_num);
////		0~99
//		random_num = (int)(Math.random()*100);
//		System.out.println(random_num);
////		0~49
//		random_num = (int)(Math.random()*50);
//		System.out.println(random_num);
//
//		
		for(;;) {
//			/* 무한반복 */
			break;
		}
		
		
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			if (i%2 != 0) {
//				sum += i;
//				if (sum >= 100)
//					System.out.println(sum+","+i);
//					break;
//			}
//		}
//		
		
//		String random_num = "";
//		
//		for (int i=0;i<5;i++) {
//			int num = (int)(Math.random()*10);
//			random_num += num;
//		}
//		
//		System.out.println(random_num);
		
		
//		System.out.println("숫자를 입력하세요 >> ");
//		String str = scanner.next();
//		int random_num = (int)(Math.random()*10);
//		int r = (char)(random_num+'0'); // 숫자를 문자형식으로..
//		
//		int num = 0;
//		for (int i=0;i<str.length();i++) {
//			
////			int snum = str.charAt(i) - '0'; // 문자를 숫자형식으로..
//
//			if (str.charAt(i)==r) {
//				num += 1;
//			}
//		}
//		System.out.println(random_num+" 이 포함된 객수 : "+num);
		
		
		
		String num1 = "9789057899979971234567";
		
		if(num1.contains("9")) {
			System.out.println("존재 합니다.");
		}else {
			System.out.println("존재하지 않습니다.");
		}
		
		
		System.out.println(num1.indexOf("7"));
		
//		if(num1.indexOf("7") == -1) {
//			System.out.println("존재하지 않습니다.");
//		}else {
//			System.out.println("문자위치 : "+num1.indexOf("7"));
//		}
		
		System.out.println(num1.indexOf("7",7));
		
		for(int i = 0;;) {
			
			if (num1.indexOf("7",i) > 0) {
					System.out.println(num1.indexOf("7",i));
			}else {
				
			}
			
			
			break;
		}
		
		
		
		
	}

}
