package j0127_01;

public class Stuscore {

	{// 초기화 블럭 : 생성자 실행시 먼저 실행되는 함수
		count++;
		no = count;
	}
	
	Stuscore(){}
	Stuscore(String name, int kor, int eng, int math ){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	void calTotal(int kor,int eng,int math) {
		this.total = kor+eng+math;
	}
	
	void calAvg(int kor,int eng,int math) {
		this.avg = (kor+eng+math)/3.0;
	}
	
}
