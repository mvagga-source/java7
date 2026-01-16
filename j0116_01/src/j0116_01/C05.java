package j0116_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		
		// String 문자열 : next() : 사이띄움, 엔터키 안됨, nextLine()
		// int 타입 : nextInt(), nextLong() 
		// float : nextFloat()
		// double : nextDouble()
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 >> ");
		String name = scanner.next();
		System.out.println("국어점수 >>");
		int kor = scanner.nextInt();
		System.out.println("영어점수 >>");
		int eng = scanner.nextInt();
		
//		System.out.println("이름 : "+name+" 국어점수 : "+kor+" 영어점수 : "+eng);
		System.out.printf("이름 : %s 국어점수 : %d 영어점수 : %d",name,kor,eng);
		
		
//		System.out.println("이름을 입력 >>> ");
//		String name = scanner.nextLine();
////		scanner.nextLine();
//		System.out.println("이름 : "+name);
//		
//		System.out.println("아이디를 입력 >>> ");
//		String id = scanner.nextLine();
//		System.out.println("아이디 : "+id);
	}
	
}
