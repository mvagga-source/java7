package J0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력번호 :
		// 도전횟수 : 
		// 정답번호 : 
		
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[10];
		int cnt = 0;
		int r = (int)(Math.random()*100)+1;
		
		System.out.println(r);

		
		while(cnt<10) {
			
			System.out.printf("%d번째 번호를 입력하세요 >> ",cnt+1);
			in[cnt] = sc.nextInt();
			if(r == in[cnt]){
				break;
			}
			
			cnt++;			
		}
		System.out.println();
		System.out.println("입력한 번호 : "+Arrays.toString(in));
		System.out.println("도전횟수 : "+cnt+1);
		System.out.println("정답번호 : "+r);
		
		
	}

}
