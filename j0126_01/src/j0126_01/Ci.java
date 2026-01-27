package j0126_01;

public class Ci extends Shap {
	
	Point center;
	int r;
	
	// 기본생성자
	Ci(){
		this(new Point(0,0),100);
	}
	
	// 전체생성자
	Ci(Point center,int r){
		this.center = center;
		this.r = r;
	}

}
