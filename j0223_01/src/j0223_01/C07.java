package j0223_01;

public class C07 {

	public static void main(String[] args) {
		
		Stuscore[] s = new Stuscore[10];
		//s[0] = new Stuscore();
		s[0] = new Stuscore("홍길동",100,100,99);
		s[1] = new Stuscore("유관순",90,90,91);
		s[2] = new Stuscore("이순신",90,90,91);
		s[3] = new Stuscore();
		s[3].name = "강감찬";
		s[3].kor = 100;
		s[3].eng = 100;
		s[3].math = 99;
		s[3].cal();
		
		for(int i=0;i<Stuscore.count-1;i++) {
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",
					s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
		
	}

}
