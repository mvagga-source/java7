package j0128_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	int kor, eng, math;
	String name;
	
	void stuMenu() {
		System.out.println();		
		System.out.println("          [학생성적 프로그햄]");
		System.out.println("==================================");
		System.out.println("1.입력,2.수정,3.출력,4.삭제,5.검색,0.종료");
		System.out.println("==================================");
		System.out.println();		
	}
	
	void stuTitle() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
	}

	void stuInput() {
		
		System.out.println("학생 이름을 입력하세요(0.이전 페이지)");
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
	
}
