package j0223_01;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		String name = "";
		int kor=0, eng=0, math=0;
		int cho=0;

		loop:while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("------------------");
			System.out.println("1.입력, 2.출력");
			System.out.println("------------------");
			System.out.println("원하는 번호 입력 >> ");
			cho = scanner.nextInt();
			switch(cho) {
			case 1:
				System.out.println("@학생입력");
				while(true) {
					System.out.println("이름을 입력하세요.(0.이전으로) >> ");
					name = scanner.next();
					if(name.equals("0")) break;
					
					System.out.println("국어점수 입력 >> ");
					kor = scanner.nextInt();
					System.out.println("영어점수 입력 >> ");
					eng = scanner.nextInt();
					System.out.println("수학점수 입력 >> ");
					math = scanner.nextInt();
					
					s[Stuscore.count] = new Stuscore(name,kor,eng,math);
					System.out.println();
				}
				break;
			case 2:
				System.out.println("@학생출력");
				System.out.println("---------------------------------------------------------");
				System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("---------------------------------------------------------");
				for(int i=0;i<Stuscore.count;i++) {
					s[i].print();
				}			
				System.out.println();
				
				break;
			case 3:
				break;
			default:
				break loop;
			}//switch
			
		}// while
		
		System.out.println("## 프로그램 종료 ##");		
	}

}
