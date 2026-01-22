package j0122_01;

public class C0122_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다른 클래스를 사용하는 방법 - 객체선언
		int a;
		a = 10;

		Tv t1 = new Tv();
		
		t1.color = "white";
		
		System.out.println(t1.color);
		System.out.println(t1.power);
		//t1.power = true;
		t1.power();
		System.out.println(t1.power);
		
		System.out.println(Tv.width);
	}

}
