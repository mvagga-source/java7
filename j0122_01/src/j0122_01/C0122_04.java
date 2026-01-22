package j0122_01;

public class C0122_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본배열
		Stuscore[] sArr = new Stuscore[10];
		//객체선언
		sArr[0] = new Stuscore();
		sArr[1] = new Stuscore();
		System.out.println(sArr[0].count);
		System.out.println(sArr[1].count);
		sArr[0].count++;
		System.out.println(sArr[0].count);		
		System.out.println(sArr[1].count);
		
		
//		Stuscore s = new Stuscore();
//		s.no = Stuscore.count + 1;
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 99;
//		s.calTotal();
//		s.calAvg();
//		Stuscore.count++;
//		
//		Stuscore s1 = new Stuscore();
//		s1.no = Stuscore.count + 1;
//		s1.name = "고길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 99;
//		s1.calTotal();
//		s1.calAvg();
//		Stuscore.count++;
//		
//		System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s.no,s.name,s.kor,s.eng,s.math,s.total,s.avg);
//		System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s1.no,s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
//		
	}

}
