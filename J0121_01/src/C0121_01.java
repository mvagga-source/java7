import java.util.Arrays;
import java.util.Scanner;

public class C0121_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int[] equal_num = new int[6];
		int equal_cnt = 0;
		
		Scanner sc = new Scanner(System.in);

//		랜덤 번호 생성
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		//System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++) {
			if (i==0) System.out.print(num[i]);
			else System.out.print(", "+num[i]);
		}
		System.out.println();
		
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		
		//출력		
		for(int i=0;i<num.length;i++) {
			if (i==0) System.out.print(num[i]);
			else System.out.print(", "+num[i]);
		}
		System.out.println();
		
		for(int i=0;i<random.length;i++) {
			random[i] = num[i];
		}
		
//		번호 입력
		for(int i=0;i<input.length;i++) {
			System.out.print("1~45까지 번호를 입력 >> ");
			input[i] = sc.nextInt();
		}
		System.out.println();

//		번호 맞추기
		for(int i=0;i<random.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(random[i] == input[j]) {
					equal_num[equal_cnt] = random[i];
					equal_cnt++;
				}
			}
		}
		
		System.out.println("당첨번호 :"+Arrays.toString(random));
		System.out.println("입력번호 :"+Arrays.toString(input));
		System.out.println("당첨된 번호 :"+Arrays.toString(equal_num));
		System.out.println("당첨된 갯수 :"+equal_cnt);
		
	}

}
