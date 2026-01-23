package j0223_01;

public class C04 {
	
	static int add(int a, int b) {
		return a+b;
	}	
	
	static void add2(int a, int b) {
		System.out.println(a+b);
	}		

	public static void main(String[] args) {
		
		int a = 10;
		int b = 9;
		int c = 5;
		
		//System.out.println(C04.add(a, b));
		
		Method m = new Method();
		double result = m.avg(a, b);
//		System.out.println(result);

		int result1 = m.total(a, b, c);
//		System.out.println(result1);
		
//		m.input();
		
//		int result3 = m.input2(); 
//		System.out.println("결과값 : "+result3);
		
//		m.addSubMulti();
//		int[] result4 = new int[3];
//		result4 = m.addSubMulti2();
//		int[] result4 = m.addSubMulti2();
//		
//		System.out.println("a+b : "+result4[0]);
//		System.out.println("a-b : "+result4[1]);
//		System.out.println("a*b : "+result4[2]);
		
		int[] score = new int[3];
		m.addSubMulti3(score);
		for(int i=0; i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		
		
	}

}
