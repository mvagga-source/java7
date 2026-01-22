package J0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~45까지 랜덤숫자 6개를 추출해서
		// 입력받은 6개 숫자와 몇개 맞는지 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[45];
		int[] ran = new int[6];
		int[] inp = new int[6];
		int[] equal_num = new int[6];
		
		
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		for(int i=0;i<num.length;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[i];
			num[i] = num[no];
			num[no] = temp;
		}
		
		for(int i=0;i<ran.length;i++) {
			ran[i] = num[i];
		}
		
		Arrays.sort(ran);
		
		System.out.println("로또번호 : "+Arrays.toString(ran));		
		
		for(int i=0;i<inp.length;i++) {
			System.out.printf("%d번째 번호 입력 : \n",i+1);
			inp[i] = sc.nextInt();
		}
		
		Arrays.sort(inp);
		
		int cnt = 0;
		for(int i=0;i<ran.length;i++) {
			for(int j=0;j<inp.length;j++) {
				if(ran[i] == inp[j]) {
					equal_num[cnt] = ran[i];
					cnt++;
					break;
				}
			}
		}		
		
		System.out.println("로또번호 : "+Arrays.toString(ran));
		System.out.println("입력번호 : "+Arrays.toString(inp));
		System.out.println("당첨된번호 : "+Arrays.toString(equal_num));
		System.out.println("당첨갯수 : "+cnt);
		
		
		
	}

}
