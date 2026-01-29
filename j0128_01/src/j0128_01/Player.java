package j0128_01;

// 추상클래스 (추상매서드를 한개 이상 가질경우 추상 클래스가 됨)
abstract public class Player {
	
	int currentPlay;
		
	// 추상매서드 (미완성 매서드)
 	abstract void play(int cp); // 미완성 메소드
 	abstract void stop();
	
	void play() { // 완성 메소드
		System.out.println("실행 합니다.");
	}
}

// 