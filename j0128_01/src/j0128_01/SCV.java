package j0128_01;

public class SCV extends GroundUnit {
	SCV() {
		super(60);
		hitPoint = MAX_UP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_UP) {
				System.out.println(u.hitPoint++);
//				u.hitPoint++;
			}
		}
		
	}
}
