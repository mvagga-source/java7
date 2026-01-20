package j0120_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C0120_05 {

	// 자동으로 초기값이 부여됨 0
	static int aa;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		// 배열은 array : 같은 타입의 여러변수를 하나로 묶음, 객체
		// 컬렉션 collection : list(arrayList, LinkList), set, map  다른 타입도 가능
		
		// 메소드내에 변수들은 초기화를 해야 실행이 가능함
//		int[] a = new int[5];
		
//		int a; // 메소드내 자동초기화 안됨
//		System.out.println(a);
//		System.out.println(aa);
		
		
//		int[] score = new int[5]; // 배열은 자동 초기화 됨
//		int[] arr = new int[] {10,20,30};
//		System.out.println(score[0]);
//		System.out.println(arr[0]);
		
		// 배열에 값을 입력하는 방법
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		int[] num = {1,2,3,4,5}; // 가장 많이 사용
//		int[] num2 = new int[] {1,2,3,4,5};
		
		
//		int[] score = new int[5];
//		for(int i=0;i<5;i++) {
//			score[i] = i + 1;
//			System.out.println(score[i]);
//		}
//		
		
		
//		int[] a = new int[5];
//		int[] input = new int[5];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i] = (int)(Math.random()*10)+1;
//			System.out.println("숫자를 입력 >> ");
//			input[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.printf("%d\t",a[i]);
//		}
//		for(int i=0;i<input.length;i++) {
//			System.out.printf("%d\t",input[i]);
//		}
		
		
//		String[] name = new String[3];
//		int[] kor = new int[3];
//		
//		for(int i=0; i<name.length;i++) {
//		
//			System.out.println("이름 입력 >> ");
//			name[i] = sc.next();
//			
//			System.out.println("국어점수 입력 >> ");
//			kor[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<name.length;i++) {
//			System.out.printf("이름 : %s, 국어 : %d\n", name[i], kor[i]);
//		}		
		

//		int[] arr = new int[10];
//		
//		int i = 0;
//		while(i<arr.length) {
//
//			int num = (int)(Math.random()*10)+1;
//			
//			boolean isD = false;
//			for(int j=0;j<i;j++) {
//				if(arr[j] == num) {
//					isD = true;
//					break;
//				}
//			}
//			
//			if (!isD) {
//				arr[i] = num;
//				i++;
//			}
//		}
//		
//		for(int n:arr) {
//			System.out.println(n+"");
//		}

//		int[] num = {1,2,3,4,5,6,7,8,9,10};
//
//		System.out.println("순차번호 : "+Array.toString(num));
//		
//		for(int i=0;i<300;i++) {
//			int no = (int)(Math.random()*10);
//			int temp = num[0];
//			num[0] = num[no];
//			num[no] = temp;
//		}
//		
//		System.out.println(Arrays.toString(num));
		
		
		int[] random = new int[45];
		int[] input = new int[6];
		
		for(int i=0;i<45;i++) {
			random[i] = i+1;
		}
		
		System.out.println(Arrays.toString(random));
		
		for(int i=0;i<100;i++) {
			int no = (int)(Math.random()*45);
			int temp = random[0];
			random[0] = random[no];
			random[no] = temp;
		}
		
		System.out.println(Arrays.toString(random));
		
		
		
		
		
	}

}
