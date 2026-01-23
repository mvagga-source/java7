package j0223_01;

import java.util.Scanner;

public class Method {
	
	static Scanner scanner = new Scanner(System.in);
	
	double avg(int a, int b) {
		//double result = (a+b)/2.0;
		return (a+b)/2.0;
	}
	
	int total(int a, int b, int c) {
		return a+b+c;
	}
	
	void input() {
		System.out.println("숫자를 입력하세요 >> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요 >> ");
		int b = scanner.nextInt();
		
		System.out.println("합계 : "+(a+b));
	}
	
	int input2() {
		System.out.println("숫자를 입력하세요 >> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요 >> ");
		int b = scanner.nextInt();
		
		int result = a+b;
		
		return result;
	}
	
	void addSubMulti() {
		System.out.println("숫자를 입력하세요 >> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요 >> ");
		int b = scanner.nextInt();
		
		System.out.println("a+b : "+(a+b));
		System.out.println("a-b : "+(a-b));
		System.out.println("a*b : "+(a*b));
	}
	
	int[] addSubMulti2() {
		
		int[] result = new int[3];
		
		System.out.println("숫자를 입력하세요 >> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요 >> ");
		int b = scanner.nextInt();
		
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		
		return result;
	}
	
	// 배열,객체를 매개변수로 보낼 시 리턴이 필요없음
	void addSubMulti3(int[] result) {
		
		System.out.println("숫자를 입력하세요 >> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요 >> ");
		int b = scanner.nextInt();
		
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
	} 
	
	

}
