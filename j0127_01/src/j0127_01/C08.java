package j0127_01;

public class C08 {

	public static void main(String[] args) {
		
		Car c1 = null;
		FireCar f1 = new FireCar();
		
		AmbulCar a1 = null;
		
		c1 = f1;
		a1 = (AmbulCar)c1;

		if (c1 instanceof AmbulCar) {
			System.out.println("형변환 가능");
			a1 = (AmbulCar)c1;
		}else {
			System.out.println("형변환 불가능");
		}
		
		
//		if (f1 instanceof Car) {
//			System.out.println("형변환 가능");
//		}
//		
//		if (f1 instanceof FireCar) {
//			System.out.println("형변환 가능");
//		}
//		
//		if (f1 instanceof Object) {
//			System.out.println("형변환 가능");
//		}

	}

}
