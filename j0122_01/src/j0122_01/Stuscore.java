package j0122_01;

public class Stuscore {

	// 인스턴스 변수(객체 선언후 사용)
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 클래스 변수 (클래스명으로 사용)
	static int count;
	
	public void calTotal() {
		total = kor+eng+math;
	}
	
	public void calAvg() {
		avg = total/3.0;
	}
}
