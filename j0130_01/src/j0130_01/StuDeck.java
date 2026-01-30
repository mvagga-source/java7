package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Stuscore> list = new ArrayList<Stuscore>();
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	int no,kor,eng,math,total,choice,temp;
	String name;
	double avg;
	String filePath = "c:/aaa/stu.txt";
	
	void stuDelete() {
		System.out.println("삭제하려는 학생이름을 입력 >> (0.이전 페이지) ");
		name = scan.next();
		if(name.equals("0")) return;
		
		temp = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				temp = 1;
				System.out.println(name+"학생을 찾았습니다. 삭제하시겠습니까?(1.예,2.아니오)");
				choice = scan.nextInt();
				if(choice == 1) {
					list.remove(i);
					System.out.println("## "+name+" 학생성적이 삭제 되었습니다.");
				}else {
					System.out.println("## 삭제를 취소 하였습니다.");
				}
				break;
			}//if
		}//for
		if(temp == 0) {
			System.out.println("## 찾고자하는 학생이 없습니다.");
			System.out.println();
		}
	}
	
	void stuInput() {
		System.out.println((Stuscore.count+1)+"번 학생이름을 입력 >> (0.이전 페이지) ");
		name = scan.next();
		if(name.equals("0")) return;
		
		System.out.println("국어점수를 입력 >> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력 >> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력 >> ");
		math = scan.nextInt();
		list.add(new Stuscore(name, kor, eng, math));
		System.out.println(name+" 학생 성적 저장완료!");
		System.out.println();
	}
	
	void stuPrint() {
		System.out.println("-------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("-------------------------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg());
		} // for
		System.out.println();
		
	} //stuPrint
	
	void fileSave() {
		
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i=0;i<list.size();i++) {
				String txt = String.format("%d,%s,%d,%d,%d,%d,%.2f\n",
						 list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),
						 list.get(i).getEng(),list.get(i).getMath(),
						 list.get(i).getTotal(),list.get(i).getAvg());
				bw.write(txt);
			}
			
			bw.close();
			fw.close();
			System.out.println("## 파일 저장하기 완료!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	void fileOpen() throws Exception { // 메인으로 Exception 전달 
	void fileOpen() {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				
				String[] st = line.split(",");
				no = Integer.parseInt(st[0]);
				name = st[1];
				kor = Integer.parseInt(st[2]);
				eng = Integer.parseInt(st[3]);
				math = Integer.parseInt(st[4]);
				total = Integer.parseInt(st[5]);
				avg = Double.parseDouble(st[6]);
				list.add(new Stuscore(no, name, kor, eng, math, total, avg));
			}
			
			br.close();
			fr.close();
			System.out.println("## 파일 불러오기 완료!");
			
		} catch (Exception e) {e.printStackTrace();}
	} // fileOpen
	
	// 화면 출력
	void screen() {
		System.out.println();		
		System.out.println("                   [학생성적 프로그햄]");
		System.out.println("========================================================");
		System.out.println("1.입력,2.출력,3.수정,4.삭제,5.검색,6.정렬,8.파일열기,9.파일저장,0.종료");
		System.out.println("========================================================");
		System.out.println();	
		System.out.println("원하는 번호를 입력 >> ");		
		
	} // screen

}
	