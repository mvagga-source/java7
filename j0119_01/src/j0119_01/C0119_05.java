package j0119_01;

//import java.util.Scanner;
import java.util.*;

public class C0119_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("input num >> ");
//		int input = scanner.nextInt();
//		
//		if (input >= 90) System.out.println("수");
//		else if (input >= 80) System.out.println("우");
//		else if (input >= 70) System.out.println("미");
//		else if (input >= 60) System.out.println("양");
//		else System.out.println("가");
		
		
//		String str = "19754";
//		int num = 0;
//		
//		if (str.charAt(0) == '7') num++;
//		else if (str.charAt(1) == '7') num++;
//		else if (str.charAt(2) == '7') num++;
//		else if (str.charAt(3) == '7') num++;
//		else if (str.charAt(4) == '7') num++;
//		
//		System.out.println("7이 포함된 갯수 : "+num);


		System.out.println("input num >> ");
		int input = scanner.nextInt();
		
		if (input > 90) {
			if (input >= 98) {
				System.out.println("A+");
			}else if(input >= 94) {
				System.out.println("A");
			}else if(input >= 93) {
				System.out.println("A-");
			}
		} else if (input > 80){
			
		}
		
		
		switch(input) {
		case 1:
			
			break;
		case 2:
			
			break;
			
		default:
			
		}
		
//		0.0 <= Math.random() < 1.0
//		1~10범위의 임의의 정수를 얻는 식
//		a. 0.0 * 10 <= Math.random() * 10 < 1.0 * 10;
//		b. (int)0.0 <= (int)Math.random() * 10 < (int)10.0;
//		c. 0 + 1 <= (int)Math.random() * 10 + 1 < 10 + 1;
		
		

	}

}
