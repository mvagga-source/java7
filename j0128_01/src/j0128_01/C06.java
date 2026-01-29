package j0128_01;

public class C06 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		
		Tank t = new Tank();
		System.out.println(t.hitPoint);
		
		t.hitPoint -= 30;
		System.out.println(t.hitPoint);
		
		SCV s = new SCV();
		s.repair(t);
//		s.repair(m);
		System.out.println(t.hitPoint);
		
		

//		System.out.println(m.hitPoint);
		
		
	}

}
