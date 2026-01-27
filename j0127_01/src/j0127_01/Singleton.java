package j0127_01;

public class Singleton {
	
	private static Singleton s = new Singleton();
	private int num;
	
	private Singleton(){}
	
	// 클래스 메소드 : 클래스명.메소드
	public static Singleton getInstance() {
		return s;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
