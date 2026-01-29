package j0128_01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	
	StuDeck() {
		list.add(new Stuscore("홍길동",100,99,100));
		list.add(new Stuscore("박길동",100,77,100));
		list.add(new Stuscore("고길동",100,88,100));
	}

	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	int no,kor,eng,math,total;
	String name;
	double avg;
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	// 상단메뉴출력
	void screen_print() {
		System.out.println();
		System.out.println("           [학생성적 프로그램]");
		System.out.println("1.성적입력,2.출력,3.수정,4.삭제,5.검색,0:종료");
		System.out.println("=====================================");
		System.out.println("원하는 번호를 입력 >> ");		
	}
	
	// 성적 입력
	void stuInput() {
		System.out.println((Stuscore.count+1)+"번 학생이름을 입력 (0.이전 페이지) >> ");
		name = scan.next();
		if(name.equals("0")) return;
		System.out.println("국어점수를 입력 >> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력 >> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력 >> ");
		math = scan.nextInt();
		
		list.add(new Stuscore(name,kor,eng,math));
		System.out.println("## 학생성적이 추가 되었습니다.##");
		System.out.println();
	}
	
	// 성적 출력
	void stuOutput() {
		System.out.println();
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("## 학생성적이 출력 되었습니다.##");
	}
	
	void stuDelete() {
		int temp = 0;
		System.out.println("삭제하려는 학생이름 입력 >> ");
		name = scan.next();
		
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			if(s.getName().equals(name)) {
				temp = 1;
				System.out.println(name+" 학생을 찾았습니다. 삭제 하시겠습니까?(1.삭제,0.취소)");
				int choice = scan.nextInt();
				if(choice == 1) {
					list.remove(i);
					System.out.println("## "+name+" 학생이 삭제 되었습니다.");
					System.out.println();
				}else {
					System.out.println("## 삭제를 취소하셨습니다.");
					System.out.println();
				}
			}
		}// for
		
		if(temp == 0) {
			System.out.println("## 삭제하려는 학생이 없습니다. 다시 입력!!");
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
