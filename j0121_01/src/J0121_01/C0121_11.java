package J0121_01;

import java.util.Scanner;

public class C0121_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int count = 0;		
		
		loop:while(true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("--------------------------------");			
			System.out.println("1:입력, 2:출력, 3:수정, 4:검색, 0:종료");
			System.out.println("--------------------------------");
			System.out.print("원하는 번호 입력 >> ");
			int cho = sc.nextInt();
			System.out.println();
			
			switch(cho) {
				case 1:
					while(true) {
						
						System.out.println("@성적입력");
						System.out.printf("%d번째 학생이름을 입력(0.이전으로) : ",count+1);
						name[count] = sc.next();
						
						if(name[count].equals("0")) break;
						
						for(int i=0;i<3;i++) {
							System.out.printf("%s 점수를 입력 : ",title[i+2]);
							score[count][i] = sc.nextInt();
							score[count][3] += score[count][i];
						}
						avg[count] = score[count][3]/3.0;
						count++;
					}
					
					break;
				case 2:
					System.out.println("@성적출력");
					System.out.println("-----------------------------------------------------");					
					for(int i=0; i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("-----------------------------------------------------");
					
					for(int i=0; i<count;i++) {
						System.out.printf("%d\t",i+1);
						System.out.printf("%s\t",name[i]);
						for (int j=0;j<score[i].length;j++) {
							System.out.printf("%d\t",score[i][j]);
						}
						System.out.printf("%.2f\n",avg[i]);
					}
					System.out.println();

					break;
				case 3:
					break;
				case 4:
					System.out.println("@학생검색");
					System.out.println("검색할 학생이름 입력 >> ");
					String se = sc.next();
					
					System.out.println("-----------------------------------------------------");					
					for(int i=0; i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("-----------------------------------------------------");
					
					int chk = 0;
					for(int i=0; i<count;i++) {
						
						//if(name[i].equals(se)) {
						if(name[i].contains(se) ) {
							
							System.out.printf("%d\t",i+1);
							System.out.printf("%s\t",name[i]);
							for (int j=0;j<score[i].length;j++) {
								System.out.printf("%d\t",score[i][j]);
							}
							System.out.printf("%.2f\n",avg[i]);
							
							chk = 1;
						}
						
					}
					
					if (chk == 0) System.out.println("검색된 학생이 없습니다.");
					
					System.out.println();
					
					
					break;
				default:
					System.out.println("## 프로그램 종료 ##");
					break loop;
			}
			
		}
		
		
		
	}

}
