package j0128_01;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		
		loop:while(true) {
			s.screen_print();
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				s.stuInput();
				break;
			case 2:
				s.stuOutput();
				break;
			case 3:
				break;
			case 4:
				s.stuDelete();
				break;				
			case 0:
				System.out.println();				
				System.out.println("## 프로그램 종료 ##");
				break loop;
			}
		}
		
		
//		Stuscore s = new Stuscore();
//		s.setName("홍길동");
//		s.setKor(-1);
//		
//		System.out.println(s.getKor());

	}

}
