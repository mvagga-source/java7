package j0122_01;

import java.util.Arrays;

public class C0122_06 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		int c = 2;
		
		int result1 = 0, result2 = 0, result3 = 0;
		double result4 = 0;
		int[] re;
		// add, sub, mul, div 함수생성
		// 결과값을 리턴받아 출력
		result1 = add(a,b,c);
		result2 = sub(a,b,c);
		result3 = mul(a,b,c);
		result4 = div(a,b,c);
		
		re = cal(a,b,c);
		System.out.println(Arrays.toString(re));
		
		System.out.printf("add : %d\n",result1);
		System.out.printf("sub : %d\n",result2);
		System.out.printf("mul : %d\n",result3);
		System.out.printf("div : %.2f\n",result4);

		
	}
	
	static int[] cal(int a, int b, int c) {
		
		int[] re = new int[2];
		re[0] = a+b+c;
		re[1] = a-b-c;
		
		return re;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static int sub(int a, int b, int c) {
		return a-b-c;
	}
	
	static int mul(int a, int b, int c) {
		return a*b*c;
	}
	
	static double div(int a, int b, int c) {
		return ((double)a/b)/c;
	}

}
