
import java.util.Arrays;

public class C0121_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a = {1,2,3,4,5};
//		System.out.println(Arrays.toString(a));
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//
//		int[][] score = {
//				{100,90,100},
//				{100,100,80},
//				{90,100,70},
//		};
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int[][] score = new int[5][5];
		
 
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = (i*5)+j+1;
				score[i][j] = num[(i*5)+j];
			}
		}
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
