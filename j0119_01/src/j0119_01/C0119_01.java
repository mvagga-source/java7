package j0119_01;

// 내장객체는 import 해야 사용가능 - System, Math..
import java.util.Scanner;

public class C0119_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 함수 -> 매소드
		// 함수, 객체 차이점 -> 이름() : 함수, 클래스 : 첫글자가 대문자
//		System.out.println("출력");

		// 입력부분 - 객체선언


//		Scanner scanner = new Scanner(System.in); 
//		System.out.println("숫자를 입력 >> ");
//		int a = scanner.nextInt(); 
//		System.out.println("입력된 숫자 : "+a);
		

//		int b = 2_147_483_647;
//		System.out.println(b+2); // 오버플로우
//		
		
		long f = 1_000_000_000_000_000_000L;
		float g = 1.0f;
		double h = 1.0d;
		final int MAX = 100; // 상수선언
		char c = 'a';
		char cc = ' ';
		// char c = ''; 아무것도 넣지 않는 것은 오류

		char ch = 'A';
		char ch2 = '\u0041';		
		System.out.println((int) ch); // 아스키 문자
		System.out.println(ch+1); // byte, short, char -> +연산을 하면 int 타입으로 변형
		int ch3 = 97;
		System.out.println((char)ch3);
		char ch4 = 97;
		System.out.println(ch4);
		char tab = '\t';
		int hex = 0x100; // 16진수
		
		
		String str = new String("abc");
		//str = null;
		System.out.println(str);
		
		// String 객체만 new를 사용하지 않아도 됨
		String str2 = "aaa"; 
		System.out.println(str2);
		
		// 문자열은 + 연산만 가능함    anytype + 문자열 = 문자열
		str2 = "" + 7;
		System.out.println(str2);
		
		str2 = 7 + 7 + "";
		System.out.println(str2);	
		
		// 큰쪽에서 작은쪽으로 갈경우 형변환 선업해야함
		float j = 1.3f;
		int i = (int)j;
		
	}

}
