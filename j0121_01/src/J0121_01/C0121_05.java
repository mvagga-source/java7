package J0121_01;

import java.util.Scanner;

public class C0121_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		학생성적 프로그램
		String[] name = new String[2];
		int[][] score = new int[2][4];
		double[] avg = new double[2];
		
		int i = 0;
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		while(i<2) {
			System.out.println("이름 입력 >> ");
			name[i] = sc.next();
			
			int total = 0;
			for(int j=0;j<3;j++) {
				System.out.printf("%s 점수를 입력 >> \n",title[j+1]);
				score[i][j] = sc.nextInt();
				total += score[i][j];
			}
			score[i][3] = total;
			avg[i] = total/3.0;
			i++;
		};
		
		System.out.println("[학생 성적 프로그램]");
		System.out.println("-----------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.print(title[j]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		for(int j=0;j<score.length;j++) {
			System.out.print(name[j]+"\t");
			for(int k=0;k<score[j].length;k++) {
				System.out.print(score[j][k]+"\t");
			}
			System.out.printf("%.2f \t",avg[j]);
			System.out.println();
		}
		
		
		
		
//		2차원 랜덤번호 부여
//		int[][] score = new int[5][5];
//		int[] a = new int[25];
//
//		for(int i=0;i<a.length;i++) {
//			a[i] = i+1;
//		}
//
//		for(int i=0;i<200;i++) {
//			int no = (int)(Math.random()*25);
//			int temp = a[0];
//			a[0] = a[no];
//			a[no] = temp;
//		}		
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				//score[i][j] = (i*5)+j+1;
//				score[i][j] = a[(i*5)+j];
//			}
//		}		
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}

		
		
//		int[] a = new int[3];
//		int[] a = {1,2,3};
		
//		int[] a = new int[3];
//		for(int i=0; i<a.length;i++) {
//			a[i] = i+1;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			int no = (int)(Math.random()*3);
//			int temp = a[i];
//			a[i] = a[no];
//			a[no] = temp;
//		}
//		
//		for(int i=0; i<a.length;i++) {
//			System.out.print(a[i]+"\t");
//		}
		
		
		
		
	}
}
