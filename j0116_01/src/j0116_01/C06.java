package j0116_01;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		타입크기 순서 : byte<short,char<int<long<float<double<string

//		int a = 10;
//		int b = 3;
		
		// 삼항연산자
		
		Scanner scanner = new Scanner(System.in);
		
//		int result = Math.max(5, 10);
//		int result = Math.max(5, Math.max(10, 7) );
		
//		System.out.println("숫자를 입력 >> ");
//		int a = scanner.nextInt();
//		System.out.println("숫자를 입력 >> ");
//		int b = scanner.nextInt();
//		System.out.println("숫자를 입력 >> ");
//		int c = scanner.nextInt();
//		int result = (a>b)?( (a>c)?a:c ):( (b>c)?b:c );
		
		int a = 5;
		int b = 10;
		int c = 7;
		
		System.out.println(++a);
		
		int result_max = (a>b)?( (a>c)?a:c  ): ( (b>c)?b:c );
		int result_min = (a<b)?( (a<c)?a:c  ): ( (b<c)?b:c );
		
		int result_middle = (a+b+c)-result_max-result_min;
	
		System.out.printf("최대값 : %d, 최소값 : %d, 중간값 : %d",result_max, result_min, result_middle);		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력 >> ");
//		a = scanner.nextInt();
//		String result = (a>0)?"0보다 큰수":"0보다 작은 수";
//		System.out.println(result);
		
//		a = -5;
//		int result = (a>0)?a:-a;
//		System.out.println(result);
		
		
		
//		System.out.println("두수를 입력 >>");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		
//		int result = (a>b)?a:b;
//		
//		System.out.println(result);

//		System.out.println(a > b);
//		System.out.println(a < b);
//		System.out.println(a == b);
//		System.out.println(a != b);
//
////		산술연산자
//
//		System.out.println(a+b); System.out.println(a-b); System.out.println(a*b);
//		System.out.println(a/b); System.out.println(a%b);


//		int a = 1;
//		a += 1;
//		a++;
//		System.out.println(a);
//		
//		boolean bol = true;
//		System.out.println(!bol);
//		
//		System.out.println(10/3);
//		System.out.println((double)10/3);

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력>>> ");
//		String name = scanner.nextLine();
//		System.out.println("국어점수를 입력>>> ");
//		int kor = scanner.nextInt();
//		System.out.println("영어점수를 입력>>> ");
//		int eng = scanner.nextInt();
//		
//		double avg1 = total/(double)2;
//		double avg2 = total/2.0;
//		
////		System.out.printf("%s, 국어 : %d, 영어 : %d, 합계 : %d, 평균 : %.2f",name,kor,eng,kor+eng,(kor+eng)/(double)2);
//		System.out.printf("%s, 국어 : %d, 영어 : %d, 합계 : %d, 평균 : %.2f",name,kor,eng,kor+eng,(kor+eng)/2.0);

	}

}
