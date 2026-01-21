package J0121_01;

import java.util.Arrays;

public class C0121_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열은 수정만 가능
		//int[] num = new int[5];
		int[] num = {1,2,3,4,5};
		int[] num2 = new int[10];
		
		System.out.println(Arrays.toString(num));
		
		// 배열의 값을 복사
		System.arraycopy(num, 0, num2, 0, num.length);
		
		System.out.println(Arrays.toString(num2));
		
	}

}
