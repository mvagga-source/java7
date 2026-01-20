package j0119_01;

import java.util.Scanner;

public class C0119_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = -10;
//		System.out.println(a);
//		int b = 10;
//		
//		// 삼항연산자
//		String str = (a>b)?"TRUE":"FALSE";
//		System.out.println(str);
		
		// 이항 연산자
		int a = 1_000_000;
		int b = 2_000_000;
		long c = (long)a * b;
		
		System.out.println(c);
		
		
		//long a = 10000000 * 10000000; // int * int
//		long bb = 10000000 * 10000000L; // int * int

		// char = ASCII 문자로 표현
		char c1 = 'a';
//		char c2 = c1 + 1;
		int c2 = c1 + 1;
//		char c2 = (char)c1+1;
//		System.out.println(c2);
//		System.out.println((char)c2);
		
		char c3 = c1++; // char특징 : ++, -- 싫행시켜줌
//		System.out.println(c3);
//		System.out.println(c1);
		
		// 문자형을 숫자형식으로 변경하고자 할 경우 
		int i = 'b' - 'a';
//		System.out.println(i);
		
		int j = '2' - '0';
//		System.out.println(j);
		
		int k = '5' - '0';
//		System.out.println(k);
		
		char ch = '5'; // ascii 값 :  53
//		int num = (int)ch;
//		System.out.println(num);
		int num = (int)ch-48;
//		System.out.println(num);
		num = ch-48;
//		System.out.println(num);
		
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 한번에 입력(13)");
		String num2 = scanner.next();
		char ch1 = num2.charAt(0); // string -> char
		char ch2 = num2.charAt(1);
		System.out.println((int)ch1+","+(int)ch2);
		int result = (ch1 - '0') + (ch2 - '0');
//		System.out.printf("결과값 : %d\n ",(ch1 -'0')+(ch2 - '0'));
		System.out.printf("결과값 : %d\n ",result);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
