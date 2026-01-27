package j0126_01;

public class CMethod {

	CMethod(){} // 기본생성자
	
	int[] method(int num) {
//		int a = 10;
		int[] arr = {1,2,3};
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = arr[i]*num;
		}
		
		return arr;
	}
}
