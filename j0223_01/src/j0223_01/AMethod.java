package j0223_01;

import java.util.Scanner;

public class AMethod {
	
	void input(int[] num) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<num.length;i++) {
			System.out.println("숫자를 입력 하세요 >> ");
			num[i] = scanner.nextInt();
		}

	}

}
