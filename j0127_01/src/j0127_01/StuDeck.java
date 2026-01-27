package j0127_01;

public class StuDeck {

	
	
	Stuscore[] s = new Stuscore[10];
	
	void stuPrint() {
		System.out.println("[학생성적 프로그램]");
		System.out.println("--------------------------------------");		
		System.out.println("1.입력, 2.출력, 3.수정, 4.검색 0:종료 ");
		System.out.println("--------------------------------------");
		System.out.println("원하는 번호 입력 >> ");		
	}
	
	void stuInput() {
		s[0] = new Stuscore("고길동",100,100,99);
		s[1] = new Stuscore("최길동",100,10,99);
	}
	
//	for(int i=0;i<3;i++) {
//	System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].no, s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
//}
	

}
