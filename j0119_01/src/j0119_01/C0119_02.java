package j0119_01;

import java.util.Scanner;

public class C0119_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a = 10;
//		int b = 3;
//		System.out.println(a/b); // 3
//		System.out.println(a/(double)b); // 3.333..
//		System.out.printf("%.2f",(a/(double)b)); // 3.33
		
		
//		이름과 숫자를 입력해서, 실수 소수점 3자리까지 입력 첫째자리까지 출력하시오
		// Scanner => (String) next(), nextLine()
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("이름을 입력 >> ");
//		String name = scanner.next();
//		System.out.print("실수를 입력 >> ");
//		double num = scanner.nextDouble();
//		System.out.printf("%s, %.1f", name, num);
		
		
//		System.out.println("안녕"+5.8);
//		System.out.print(3+5+"방가"+4+2+"\n");
//		System.out.printf("%s:%d","홍길동",15);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력 >>");
		String name = scanner.next(); // 사이띄움 안됨, enter키 입력없음
		System.out.println("이름 : "+name);
		
		
		
	}

}
