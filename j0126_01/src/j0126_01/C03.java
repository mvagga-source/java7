package j0126_01;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {

		// 개별적인 객체선언
//		Stuscore s1 = new Stuscore();
//		s1.name = "고길동";
//		s1.kor = 100;
//		s1.eng = 99;
//		s1.math = 98;
//		s1.total = (100+99+98);
//		s1.avg = s1.total/3.0;
//		
//		System.out.println(s1.no+","+s1.name);
//		
//		Stuscore s2 = new Stuscore("홍길동",100,100,99);
//		System.out.println(s2.no+","+s2.name);
//		Stuscore s3 = new Stuscore("박길동",100,100,99);
//		System.out.println(s3.no+","+s3.name);
		
		Scanner scanner = new Scanner(System.in);
		
		// 배열선언
		 Stuscore[] s = new Stuscore[10];
		 
		 System.out.println("학생이름 입력 >>");
		 String name = scanner.next();
		 System.out.println("국어점수 입력 >> ");
		 int kor = scanner.nextInt();
		 System.out.println("영어점수 입력 >> ");
		 int eng = scanner.nextInt();
		 System.out.println("수학점수 입력 >> ");
		 int math = scanner.nextInt();
		 
		 s[0] = new Stuscore(name,kor,eng,math);
		 
		 System.out.println("학생이 저장");
		 
		 System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",
				 s[0].no,s[0].name,s[0].kor,s[0].eng,s[0].math,s[0].total,s[0].avg);
		
	}

}
