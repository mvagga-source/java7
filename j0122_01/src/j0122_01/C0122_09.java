package j0122_01;

import java.util.Scanner;

public class C0122_09 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static void stuInput(int[] val) {
		System.out.println("국어점수를 입력 >> ");
		val[0] = scanner.nextInt();
		System.out.println("영어점수를 입력 >> ");
		val[1] = scanner.nextInt();
		System.out.println("수학점수를 입력 >> ");
		val[2] = scanner.nextInt();
	}

	public static void main(String[] args) {

		int[] val = new int[3];
		
		stuInput(val);
		
		System.out.println("국어점수 : "+val[0]);
		System.out.println("영어점수 : "+val[1]);
		System.out.println("수학점수 : "+val[2]);
		
		
		// 객체선언
//		MainMethod m = new MainMethod();
//		
//		Stuscore[] stuArr = new Stuscore[3];
//		m.stuInput(stuArr);

	}

}
