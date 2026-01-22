package j0122_01;

public class C0122_08 {
	
	static void cal(int kor,int eng,int math,double[] cValue) {
		cValue[0] = kor+eng+math;
		cValue[1] = cValue[0]/3;
	}

	public static void main(String[] args) {
		
		double[] cValue = new double[2];
		
		int kor = 100;
		int eng = 100;
		int math = 99;
		
		cal(kor,eng,math,cValue);
		
		System.out.printf("합계 : %d, 평균 : %.2f",(long)cValue[0],cValue[1]);

	}

}
