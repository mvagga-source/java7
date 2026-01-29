package j0129_01;

public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예외처리 방식
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0); // error
			System.out.println(4);
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(6);
			e.printStackTrace();
		} finally {
			System.out.println(7);		
		}
		System.out.println(8);		
		
	}

}
