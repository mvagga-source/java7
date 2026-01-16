package j0116_01;

import java.util.Scanner;

public class C04 {
	
	public static void main(String[] args) {
		
		System.out.println(1.2345678);
		System.out.println(10/(float)3); // 10/3.0
		System.out.println(10/(double)3); // 10/3.0
		
		System.out.println(10/3); // 10/3.0
		System.out.println((double)10/3); // 10/3.0
		
		
		// printf -> %   d:정수, f:실수 , 엔터키 기능 없음
		System.out.printf("%05d, %.2f\n",123, 10/(double)3);
		System.out.printf("%-5d, %.2f\n",123, 10/(double)3);
		System.out.printf("%.2f",10/(double)3);
		
		
		// 출력
		System.out.println();
		
		// 입력 - System : console에서 입력을 받음
		Scanner scanner = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요>> ");
		int num = scanner.nextInt(); // 정수형타입 값을 받음
		System.out.println("입력숫자 : "+num);
		
	}

}
