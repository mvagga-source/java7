package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int[] lot = new int[6];
		int count = 0;
		// 1~45 사이의 랜덤숫자 6개를 입력해서 출력
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		// 번호섞기
		for(int i=0;i<num.length;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[i];
			num[i] = num[no];
			num[no] = temp;
		}
		
		System.out.println(Arrays.toString(num));
		
		// 6개 번호 추출
//		for(int i=0;i<6;i++) {
//			random[i] = num[i];
//		}
		random = Arrays.copyOf(num, 6);
		Arrays.sort(random);
		System.out.println(Arrays.toString(random));
		
		
		// 6개 숫자 입력
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째, 1~45까지 숫자 입력 >> ",i+1);
			input[i] = sc.nextInt();
		}
		
		for(int i=0;i<random.length;i++) {
			for (int j=0;j<input.length;j++) {
				if(random[i] == input[j]) {
					lot[count] = input[j];
					count++;
					break;
				}
			}
		}
		
		String str = Arrays.toString(random);
		System.out.println("랜덤번호 : "+str);
		System.out.println("입력번호 : "+Arrays.toString(input));
		System.out.println("맞춘번호 개수 : "+count);
		System.out.println("맞춘번호 : "+Arrays.toString(lot));
		
		
	}

}
