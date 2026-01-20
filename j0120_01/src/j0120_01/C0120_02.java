package j0120_01;

import java.util.Scanner;

public class C0120_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Math.round(34.95));
//		System.out.println(Math.ceil(34.95));
//		System.out.println(Math.floor(34.95));
		
//		double num = 34.1592;
//		double num2 = (Math.round(num * 100))/100.0;
//		System.out.println(num2);
		
		
		Scanner scanner = new Scanner(System.in);
		
//		String str = scanner.next();
		
//		int sum = 0;
//		for (int i = 0; i<str.length();i++) {
//			sum += (str.charAt(i) - '0');
//		}
//		System.out.println(sum);

//		String s_print = "";
//		int no = 0;
//		int cnt = 0;
//		for(int i = 0; i<str.length(); i++) {
//			
//			no = str.charAt(i) - '0';
//		
//			if (no == 7) {
//				
//				if (cnt==0) s_print = i + "";
//				else s_print += ("," + i);				
//				
//				cnt += 1;
//			}
//		}

//		System.out.println(s_print);
//		System.out.println("갯수 :"+cnt);
		
		
		int sum = 0;
		while(scanner.hasNextInt()) {
			sum += scanner.nextInt();
		}
		
		System.out.println(sum);

		
//		if(str.contains("3")==true) {
//			System.out.println("3이 포함");
//		}else {
//			System.out.println("3이 미포함");
//		}
		
	
		
	}

}
