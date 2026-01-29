package j0128_01;

// 인터페이스 : interface 붙이고 상수와 미완성 메서드로 구성됨
// 객체 선언 안됨, 상속후 사용가능, 2개이상 상속 가능
// Object를 상속받지 않는다
// 모두 구현한다
public interface PlayingCard {
//	public static final 생략가능
	int SPADE = 4;
	int HEART = 2;
	int CLOVER = 1;
	
//	public abstract 생략가능
	String getCardNumber();
	void pick();
	String getCardKind();
	
}


