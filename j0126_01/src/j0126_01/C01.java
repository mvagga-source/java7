package j0126_01;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		
		// 다른클래스에서 다른 클래스 사용하려면 객체선언
		
		// 예제
		// main 에서 입력을 받아, 입력한 값에 arr배열에 그 값을 곱하여 리턴받아 출력
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		CMethod method = new CMethod();
		int[] arr = method.method(num);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
