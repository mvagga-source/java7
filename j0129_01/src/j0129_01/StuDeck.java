package j0129_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StuDeck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList<>();

	StuDeck() {
		list.add(new StuScore("홍길동",100,99,100));
		list.add(new StuScore("박길동",100,89,100));
		list.add(new StuScore("차길동",100,79,100));
		list.add(new StuScore("최길동",100,69,100));
		list.add(new StuScore("임길동",100,59,100));
	}
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	int kor, eng, math;
	String name;
	
	void stuMenu() {
		System.out.println();		
		System.out.println("          [학생성적 프로그햄]");
		System.out.println("==================================");
		System.out.println("1.입력,2.출력,3.수정,4.삭제,5.검색,0.종료");
		System.out.println("==================================");
		System.out.println();		
	}
	
	void stuTitle() {
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("-----------------------------------------------------");		
	}

	void stuInput() {
		
		System.out.println((StuScore.count+1)+"번 학생 이름을 입력하세요(0.이전 페이지)");
		name = scan.next();
		if(name.equals("0")) {
			System.out.println("## 이전 페이지로 이동 합니다.");
			return;
		}
		
		System.out.println("국어점수를 입력 하세요 >> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력 하세요 >> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력 하세요 >> ");
		math = scan.nextInt();
		
		list.add(new StuScore(name,kor,eng,math));
		System.out.println("## 학생이 등록되었습니다.");
		System.out.println();
	}
	
	void stuPrint() {
		// 타이틀 출력
		stuTitle();
		
		
		Iterator<StuScore> it = list.iterator();
		while(it.hasNext()) {
			StuScore s = it.next();
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());			
		}
		
		// for-each
//		for(StuScore s : list){
//			System.out.println(s);
//		}
		
//		for(int i=0;i<list.size();i++) {
//			
//			StuScore s = list.get(i);
//			System.out.println(s);  // String toString() 오버라이드 처리 후 사용가능 
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//				s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
//		}
	}
	
	void stuUpdate() {
		int temp = 0;
		System.out.println("수정할 학생 이름을 입력하세요 >> ");
		name = scan.next();
		for(int i=0;i<list.size();i++) {
			
			StuScore s = list.get(i);
			
			if(name.equals(s.getName())) {
				temp = 1;
				System.out.println(name+" 학생을 정말로 수정 하시겠습니까?(1.수정,0.취소)");
				int choice = scan.nextInt();
				if(choice == 1) {
					for(int j=0;j<3;j++) {
						System.out.println((j+1)+"."+title[j+2]);
					}
					System.out.println("과목을 선택하세요 >> ");					
					choice = scan.nextInt();
					
					System.out.println("수정할 점수를 입력하세요 >> ");
					
					
					
					
					System.out.println("");
					

					System.out.println("## 수정 되었습니다.");
				}else {
					System.out.println("## 수정이 취소 되었습니다.");
				}
				break;
			}			
		}//for		
		
		if(temp == 0) {
			System.out.println("## 검색한 학생을 찾을 수 없습니다.");
		}		
	}
	
	void stuDelete() {
		int temp = 0;
		System.out.println("삭제할 학생 이름을 입력하세요 >> ");
		name = scan.next();
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			
			StuScore s = (StuScore)(it.next());
			
			if(name.equals(s.getName())) {
				temp = 1;
				System.out.println(name+" 학생을 정말로 삭제 하시겠습니까?(1.삭제,0.취소)");
				int choice = scan.nextInt();
				if(choice == 1) {
					it.remove();
					System.out.println("## 삭제 되었습니다.");
				}else {
					System.out.println("## 삭제가 취소 되었습니다.");
				}
				break;
			}
		}// while
		
//		for(int i=0;i<list.size();i++) {
//			
//			StuScore s = list.get(i);
//			
//			if(name.equals(s.getName())) {
//				temp = 1;
//				System.out.println(name+" 학생을 정말로 삭제 하시겠습니까?(1.삭제,0.취소)");
//				int choice = scan.nextInt();
//				if(choice == 1) {
//					list.remove(i);
//					System.out.println("## 삭제 되었습니다.");
//				}else {
//					System.out.println("## 삭제가 취소 되었습니다.");
//				}
//				break;
//			}			
//		}//for

		if(temp == 0) {
			System.out.println("## 검색한 학생을 찾을 수 없습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
