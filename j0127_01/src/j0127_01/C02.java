package j0127_01;

import java.util.Scanner;

// 제어자 
public class C02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		StuDeck d = new StuDeck();
		
		loop:while(true) {
			
			d.stuPrint(); // 화면출력
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 0:
				System.out.println("## 프로그램 종료 ##");
				break loop;
			}//switch
		}
		
		

	}

}
