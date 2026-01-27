package j0127_01;

public class C07 {

	public static void main(String[] args) {

		Car c = null;
		FireCar f1 = new FireCar();
		FireCar f2 = null;
		
		AmbulCar a1 = null;
		
		f1.water();
//		f2.water();
		
		// Car 생략가능
		c = (Car)f1; // 자동형변환
		
		f2 = (FireCar)c; // 강제형변환
		f2.water();
		
		a1 = (AmbulCar)c;
		
		
		
		// 형변환
		int a = 10;
		long aa = a; // 자동형변환
		
		
		
		
//		FireCar f = new FireCar();
//		f.color = "red";
//		System.out.println(f.color);
	}

}
