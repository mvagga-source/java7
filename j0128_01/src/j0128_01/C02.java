package j0128_01;

import java.util.ArrayList;

// 상속 - 자동생성
public class C02 extends Object {
	
	C02(){
		super(); // 부모생성자호츨 - 자동생성
	}

	public static void main(String[] args) {
		// 컬렉션 : 객체를 저장하는 확장배열
		// 다형성 : Object o = new Car();
		// 다형성 : Object o = new C02();
		ArrayList list = new ArrayList();
		Object o = new FireCar();
		list.add(o);
		list.add(new FireCar());
		list.add(1);
		
		FireCar ff1 = (FireCar)list.get(0);
		int aa = (int)list.get(2);
		
		System.out.println(aa);
		
		
		
		
		
//		Car c = new Car();
//		Car c2 = null;
//		
//		FireCar f1 = new FireCar();
//		FireCar f2 = null;
//		f2.water(); //error
//		
//		AmbulCar a1 = new AmbulCar();
//		AmbulCar a2 = null;
//		
//		c2 = (Car)f1;
//		f2 = (FireCar)c2; //현변환 해야함
//		f2.water();
//		
//		
//		a2 = (AmbulCar)c;

	}

}
