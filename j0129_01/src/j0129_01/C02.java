package j0129_01;

public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.printl("hi");  // 컴파일 에러
		
		// 런타임 에러 : 에러(error), 예외(exception)
		
		// 예외처리 방식
		System.out.println(1);
		System.out.println(2);
//		System.out.println(0/0);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			System.out.println(5);
			throw new Exception("고의로 발생");
//			Exception e = new Exception("고의로 발생시킴");
//			throw e;			
		} catch (Exception e) {
			System.out.println(6);
			System.out.println(e.getMessage());
			e.printStackTrace(); // 에러정보 및 위치를 출력
		}
		System.out.println(7);
		

	}

}
