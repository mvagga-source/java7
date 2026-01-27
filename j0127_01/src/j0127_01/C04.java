package j0127_01;

// public(전체 접근 허용), default(같은 클래스, 팩키지) 사용
public class C04 {

	// 클래스 변수
	static int cc;
	
	// 인스턴스 변수
	int b;
	
	public static void main(String[] args) {

		// 지역변수
		int a = 0; // 자동으로 초기화 안됨
		
		C04 c = new C04();

		System.out.println(c.b);
		System.out.println(C04.cc);		
	}

}
