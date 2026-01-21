package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_07 {
	
	public static void main(String[] args) {
		
		
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int[] equal_no = new int[6];
		int equal_cnt = 0; 
		
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<num.length;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[i];
			num[i] = num[no];
			num[no] = temp;
		}
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<random.length;i++) {
			random[i] = num[i];
		}

		Arrays.sort(random);		
		System.out.printf("로또 번호 : %s\n",Arrays.toString(random));
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<random.length;i++) {
			System.out.printf("%d 번째 번호 입력 :",i+1);
			input[i] = sc.nextInt();
		}
		
		System.out.println();
		
		Arrays.sort(input);
		System.out.printf("입력 번호 : %s\n",Arrays.toString(input));
		
		for(int i=0; i<random.length;i++) {
			for(int j=0; j<input.length;j++) {
				if (random[i] == input[j]) {
					equal_no[equal_cnt] = random[i];
					equal_cnt++;
					break;
				}
			}
		}
		
		System.out.printf("맞춘 번호 : %s\n",Arrays.toString(equal_no));
		System.out.printf("맞춘 갯수 : %d\n",equal_cnt);
	}
}
