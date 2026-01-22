package j0122_01;

import java.util.Scanner;

public class C0122_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int count = 0, chk = 0, cho = 0;
		String se = "";
		
		loop:while(true) {
			
			System.out.println("       [ 학생성적 프로그램 ]         ");
			System.out.println("--------------------------------");			
			System.out.println("1:입력, 2:출력, 3:수정, 4:검색, 0:종료");
			System.out.println("--------------------------------");
			System.out.print("원하는 번호 입력 >> ");
			cho = sc.nextInt();
			System.out.println();
			
			switch(cho) {
				case 1:
					while(true) {
						
						System.out.println("@성적입력");
						System.out.printf("%d번째 학생이름을 입력(0.이전으로) : ",count+1);
						name[count] = sc.next();
						
						if(name[count].equals("0")) {
							System.out.println(">> 이전 페이지로 이동");
							System.out.println();
							break;
						}
						
						for(int i=0;i<3;i++) {
							System.out.printf("%s 점수를 입력 : ",title[i+2]);
							score[count][i] = sc.nextInt();
							score[count][3] += score[count][i];
						}
						avg[count] = score[count][3]/3.0;
						count++;
						System.out.println("# 성적저장 완료");
						System.out.println();
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
					System.out.println("@학생수정");
					System.out.println("수정할 학생이름 입력 >> ");
					se = sc.next();					

					chk = 0;
					for(int i=0; i<count;i++) {
						
						if(name[i].equals(se)) {
							System.out.printf("[%s 학생 성적 수정 ]\n",se);
							System.out.println("1.국어, 2.영어, 3.수학 수정");
							System.out.println("----------------------");
							System.out.println("수정할 과목을 선택 >> ");
							cho = sc.nextInt();
							
							System.out.printf("# %s점수 수정\n",title[cho+1]);
							System.out.printf("현재 %s 점수 : %d\n",title[cho+1], score[i][cho-1]);
							System.out.printf("변경 %s점수 입력 >> ",title[cho+1]);
							
							score[i][cho-1] = sc.nextInt();
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3]/3.0; 
									
							chk = 1;
							
							System.out.println("# 성적수정 완료");
							System.out.println();							
						}// if
					}// for
					
					if (chk == 0) System.out.printf("%s 학생이 없습니다.\n",se);
					
					break;
				case 4:
					System.out.println("@학생검색");
					System.out.println("검색할 학생이름 입력 >> ");
					se = sc.next();
					
					System.out.println("-----------------------------------------------------");					
					for(int i=0; i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("-----------------------------------------------------");
					
					chk = 0;
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
			} // switch
			
		} // while		
		
		
	}

}
