package j0122_01;

public class C0122_05 {
	
	int aa = 0; // 인스턴스변수 - 객체선언후 참조변수명.변수명
	static int bb = 0; // 클래스변수 - 캑체선언 없이 클래스명.변수명

	void add1(int a, int b) { // 인스턴스 매서드
		System.out.println("sum : "+(a+b));
	}
	
	static int add(int a, int b) { // 클래스 매서드
//		System.out.println("sum : "+(a+b));
		return a+b;
	}
	
	static int sub(int a, int b) {
//		System.out.println("sub : "+(a-b));
		return a-b;
	}
	
	static int mul(int a, int b) {
//		System.out.println("mul : "+(a*b));
		return a*b;
	}
	
	static double div(int a, int b) {
//		System.out.println("div : "+((double)a/b));
		return (double)a/b;
	}
	
	static int addSub(int a,int b) {
		
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		int result1 = 0, result2 = 0, result3 = 0;
		double result4 = 0;
		
		result1 = add(a,b);
		result2 = sub(a,b);
		result3 = mul(a,b);
		result4 = div(a,b);
				
		System.out.printf("%d,%d,%d,%.2f \n",result1, result2, result3, result4);
		
//		
//		C0122_05 c1 = new C0122_05();
//		c1.add1(a, b);
		
		// 같은 클래스 내에는 클래스명 생략가능
//		add2(a,b);
//		sub(a,b);
//		mul(a,b);
//		div(a,b);

		
		
		
//		int a = 10;
//		int[] aArr = {1,2,3};
//		
//		System.out.println(a);
//		System.out.println(aArr);
		
		
//		C0122_05 c1 = new C0122_05();
//		System.out.println(c1.aa);
//		System.out.println(bb); // 같은 클래스내에서는 클래스명 생략가능
//
//		// 흰색, true, 7
//		// 검정, false, 10
//		
//		Tv t1 = new Tv();
//		
//		t1.color = "흰색";
//		t1.power = true;
//		t1.channel = 7;
//		
//		Tv t2 = new Tv();
//		
//		t2.color = "검정";
//		t2.power = false;
//		t2.channel = 10;
		
		
	}

}
