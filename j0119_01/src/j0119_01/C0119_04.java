package j0119_01;

import java.util.Scanner;

public class C0119_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

//		float pi = 3.141592f;
//		float shortPi = (int)(pi*1000)/1000f;
//		System.out.println(shortPi);
//		
//		숫자를 입력받아 소수점 2자리에서 절사해서 출력
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력");
//		double input = scanner.nextDouble();
//		
//		double result = (int)(input*100)/100.0;
//		
//		System.out.println("결과값 : "+result);

		// 소수점첫째자리 - 반올림 : round, 올림 : ceil, 버림 : floor
		System.out.println(Math.round(3.592));
		System.out.println(Math.ceil(5.12));
		System.out.println(Math.floor(6.99));
		
		
//		System.out.println("숫자를 입력");
//		double input = scanner.nextDouble();
		
		// 소수점 2자리에서 반올림을 하시오  34.195 -> 34.2
//		double result = (int)(input*100)/100.0;
//		double result = Math.round(input*10)/10.0;
//		System.out.println(result);
		
//		System.out.println(input*100);
//		소수점 3자리에서 반올림,올림,버림
//		double result1 = Math.round(input*100)/100.0;
//		double result2 = Math.ceil(input*100)/100.0;
//		double result3 = Math.floor(input*100)/100.0;
//		System.out.println(result1);
		
//		double a = 0.1;
//		float b = 0.1F;

//		String result = (a==b)?"같음":"다름";
//		System.out.println(a);
//		System.out.println((double)b);
//		System.out.println(result);

		
//		int input = scanner.nextInt();
//		String result = ((input%2)==0)?"짝수":"홀수";
//		System.out.println(result);
		
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("국어 점수 : ");
		int val1 = scanner.nextInt();
		System.out.println("영어 점수 : ");
		int val2 = scanner.nextInt();
		System.out.println("수학 점수 : ");
		int val3 = scanner.nextInt();
		
		int tot = val1+val2+val3;
		double avg = tot/3.0;
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f ",name,val1,val2,val3,tot,avg);
		
		
		
		
	}

}
