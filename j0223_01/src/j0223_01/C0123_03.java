package j0223_01;

public class C0123_03 {
	
	
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	double div(int a, int b) {
		return (double)a/b;
	}

	public static void main(String[] args) {
		
		// 객체선언후 사용
		C0123_03 c = new C0123_03();
		
		int a = 10;
		int b = 3;
		int result = c.add(10, 3);
		System.out.println(result);
		
		result = c.sub(10, 3);
		System.out.println(result);
		
		result = c.mul(10, 3);
		System.out.println(result);
		
		double result2 = c.div(10, 3);
		System.out.println(result2);

	}
	
	

}
