package j0223_01;

import java.util.Arrays;

public class C05 {
	
	long a,b;
	
	// 오버로딩 : 메소드명은 동일하고 매개변수 갯수 또는 타입이 다름
	long add() {
		return a+b;
	}
	
	static long add(int a, int b) {
		return a+b;
	}
	
	int[] add(int[] a) {
		return a;
	}

	public static void main(String[] args) {

		int[] num = new int[3];
		
		AMethod a = new AMethod();
		
		a.input(num);
		System.out.println(Arrays.toString(num));

	}

}
