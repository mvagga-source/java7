package j0128_01;

public class Car {
	
	static String name; // 클래스변수 
	int door; // 인스턴스변수
	int speed;
	
	void speedUp() {
		System.out.println("속도를 높입니다.");
	}
	
	void stop() {
		System.out.println("정지 합니다.");
	}
	
	// 오버로딩
	int move() {
		return 7;
	}
	
	int move(int num) {
		int no=5; // 지역변수 - 메소드를 벗어나면 지워짐, 변수 초기화 안됨, 값 지정해야함
		System.out.println("출발");
		return no*num;
	}
}
