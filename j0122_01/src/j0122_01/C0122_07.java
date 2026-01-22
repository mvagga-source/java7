package j0122_01;

public class C0122_07 {

	public static void main(String[] args) {

		
		AA aObj = new AA();
		
		aObj.a = 10;
		aObj.b = 3;
		aObj.c = 2;
		
		System.out.print("초기값 : ");
		System.out.println(aObj.result1);
		
		change(aObj);
			
		System.out.print("결과값 : ");
		System.out.println(aObj.result1);		
		
//		int[] a = {50};
		
//		System.out.println("1. "+a[0]);
		
		//change(a[0]); // 기본형 변수 
//		change(a);

//		System.out.println("2. "+a[0]);		
		
		// 일반 매개변수 사용
//		int a = 50;
//		System.out.println("1. "+a);
//		
//		change(a);
//
//		System.out.println("2. "+a);
	}
	
	static void change(AA a) {
		a.result1 = a.a + a.b + a.c; 
	}
	
//	static void change(int[] a) {
//		a[0] = 1000;
//		System.out.println("ch. : "+a[0]);
//	}
}
