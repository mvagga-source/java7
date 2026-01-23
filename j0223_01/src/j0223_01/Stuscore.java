package j0223_01;

public class Stuscore {
	
	// 초기화블럭
	{
		this.no = count+1;
		count++;		
	}
	
	// 기본생성자
	Stuscore() {}
	Stuscore(String name) {
		this.name = name;
	}	
	
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	void cal() {
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3.0;
	}
	
	void print() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				this.no,this.name,this.kor,this.eng,this.math,this.total,this.avg);		
	}
	
	static int count = 0; // 클래스변수 - 객체선언 없이
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
}
