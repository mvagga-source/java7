import java.util.Scanner;

public class C0121_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자타입 -> 문자열타입
		System.out.println(""+7+7.7);
		
//		문자열을 숫자로
		int a = Integer.parseInt("77"); // 래퍼클래스 : 기본형을 객체(object)처럼 쓰기 위해 존재
		double b = Double.parseDouble("77.7");
		
//		숫자를 문자열로
		String c = Integer.toString(10);
		
		System.out.println(a);
		System.out.println(b);
		
		// 문자(char) 숫자타입 -> int타입
		System.out.println('9'-'0');
		
		// int타입 -> char타입으로 변경
		System.out.println((char)(9+'0'));
		
		
		
		String[] binary = {
			"0000","0001","0010","0011",
			"0100","0101","0110","0111",
			"1000","1001"
		};
		
		System.out.println("숫자를 입력 >> ");
//		String input = sc.next();
//		
//		for(int i=0;i<input.length();i++) {
//			System.out.print(binary[input.charAt(i)-'0']+" ");
//		}
		
		System.out.print(binary[sc.nextInt()]+" ");
	
		
		
		
		
		
		
		
	}

}
