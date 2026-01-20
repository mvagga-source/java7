package j0120_01;

import java.util.Scanner;

public class C0120_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		#구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\t",i,j,i*j);
//			}
//			System.out.println();
//			
//		}
//
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ] \t",i);
//		}
//		System.out.println();
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf("%d X %d = %d\t",j,i,i*j);
//			}
//			System.out.println();
//			
//		}
		
		Scanner sc = new Scanner(System.in);
		
//		for (int i=0;i<=999;i++) {
//			System.out.printf("%03d\n",i);
//		}
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i<=9) {
//			while(j<=9) {
//				while(k<=9) {
//					System.out.printf("%d%d%d\n",i,j,k);					
//					k++;
//				}
//				k=0;
//				j++;
//			}
//			i++;			
//			j=0;
//		}
		
//		System.out.println("숫자를 입력 >> ");
//		int num1 = sc.nextInt();
//		System.out.println("숫자를 입력 >> ");
//		int num2 = sc.nextInt();
//		
//		int num = 0;
//		if (num1>num2) {
//			num = num1;
//			num1 = num2;
//			num2 = num;
//		}
//		
//		for (int i=num1;i<=num2;i++) {
//			System.out.printf("[ %d ] 단 \n",i);
//			
//			for (int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\t",i,j,i*j);
//			}
//			
//			System.out.println();
//		}
		

//		int ren = (int)(Math.random()*100)+1;
//		int cnt = 0;
//		
//		while(true) {
//			cnt++;
//			System.out.printf("%d번째 시도입니다.\n",cnt);
//			int num = sc.nextInt();
//			
//			if (num == ren) {
//				System.out.println("정답입니다."+ren);
//				break;
//			}
//			
//			String r_print = (num > ren)?"입력한 수보다 작은수 입니다.":"입력한 수보다 큰수 입니다.";
//			System.out.println(r_print);
//			
//			if (cnt == 10) break;
//		}
		
		int i = 10;
		String name = "홍길동";
		double avg = 99.6799999;
		System.out.printf("번호:%d, 이름:%s, 평균:%.2f\n",i,name,avg);
		
		
		int num = 100;
		String a = String.format("번호:%d, 이름:%s", num, name); // 리턴값 있음
		System.out.println(a);
		
		
		
		
		
	}

}
