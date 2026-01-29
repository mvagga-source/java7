package j0129_01;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		int a = 10;
		// wrapper(래퍼) 클래스
		Integer b = new Integer(10);
		BigInteger c = BigInteger.valueOf(9_223_372_036_854_775_807L);
//		BigInteger c = new BigInteger("9223372036854775807");
		
		System.out.println(c);
		

		// StringBuffer
//		String str = "0";
//		for(int i=1;i<10;i++) {
//			str += i; // 메모리 증가
//		}
//		System.out.println(str);		
//		
//		StringBuffer sb = new StringBuffer("0");
//		for(int i=1;i<10;i++) {
//			sb.append(i); // 동일 메모리 사용
//		}		
//		System.out.println(sb);
//		System.out.println(sb.charAt(2));


		
		// substring(0,5) - 문자열자르기
//		String txt = "10조12345번";
//		System.out.println(txt.substring(3,8)); 
//		System.out.println(txt.substring(3));
		// charAt - 문자1개 출력
//		System.out.println(txt.charAt(2)); 
		
		
		//split()
//		String txt = "1,홍길동,100,100,100,300,100.0";
//		String[] arr = txt.split(",");
//		int no = Integer.parseInt(arr[0]);
//		String name = arr[1];
//		int kor = Integer.valueOf(arr[2]);
//		int eng = Integer.valueOf(arr[3]);
//		int math = Integer.valueOf(arr[4]);
//		int total = Integer.valueOf(arr[5]);
//		double avg1 = Integer.valueOf(arr[6]);
//		double avg2 = Double.parseDouble(arr[6]);
//		System.out.println(Arrays.toString(arr));

		
		// trim()
//		String txt = "   a   b   c    ";
//		String txt2 = "     abc      ";
//		System.out.println(txt.trim());
		
		
		// replace();
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		
//		String txt2 = txt.replace("a", "A");
//		System.out.println(txt2);
//		// 해당 문자 갯수 구하기 
//		System.out.println(txt.length()-txt.replace("a", "").length());

		
		//indexOf();
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		
//		int count = 0;
//		for(int i=0;i<txt.length();) {
//			System.out.println(txt.indexOf("a",i));
//			if(txt.indexOf("a",i)<0) {
//				break;
//			}
//			i=(txt.indexOf("a",i))+1;
//			count++;
//		}
//		System.out.println(count);
		
		
		
		

	}

}
