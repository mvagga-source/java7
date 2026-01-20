package j0120_01;

import java.util.Arrays;

public class C0120_07 {
	
	public static void main(String[] args) {
		
		
		int[] num = new int[45];
		int[] random = new int[6];
		
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
		
		System.out.println(Arrays.toString(random));
		
		
		
	}
}
