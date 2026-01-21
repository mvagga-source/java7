package J0121_01;

import java.util.Scanner;

public class C0121_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[5];
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int total = 0, count = 0, num = 1;
		
		loop:while(true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.print("원하는 번호를 입력 >> ");
			
			int cho = sc.nextInt();
			switch(cho) {
			case 1: //성적입력
				total = 0;
				System.out.println("[입력]");
				System.out.printf("%d 번째 학생이름 입력 >> ",count+1);
				name[count] = sc.next();
				for(int i=0;i<3;i++) {
					System.out.printf("%s 점수를 입력하세요 >> ",title[i+2]);
					score[count][i] = sc.nextInt();
					total += score[count][i];
				}
				//합계
				score[count][3] = total;
				//평균
				avg[count] = total/3.0;
				no[count] = count+1;
				count++;
				System.out.println("학생성적이 입력 되었습니다.");
				break;
			case 2: //성적출력
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%.2f\n",avg[i]);
				}
				
				break;
			case 3:
				break;
			default:
				System.out.println("# 프로그램 종료");
				break loop;
			}
		}
		
		
				
	}

}
