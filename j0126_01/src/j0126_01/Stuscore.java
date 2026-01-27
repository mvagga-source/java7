package j0126_01;

public class Stuscore {
	
	{ // 초기화 블력 : 생성자의 공통적으로 사용되는 것들을 설정
		count++;
		no = count;
	}
	
	
	Stuscore(){} // 기본생성자
	Stuscore(String name, int kor,int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	static int count = 0;
	int no;	// 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void calTotal(int kor,int eng, int math) {
		this.total = kor+eng+math;
	}
	
	public void calAvg(int kor, int eng, int math) {
		this.avg = this.total/3.0;
	}
}
