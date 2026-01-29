package j0129_01; // 패키지 없으면 에러, 없으면 자동생성

//public class TryClass extends Object // 없으면 자동생성
public class TryClass {
	
	// 기본생성자 - 없으면 에러, 없으면 자동생성
	TryClass(){
		super(); // 자동생성 - 부모생성자 호출
	}
	
	// equals(), toString(), hasCode().. 11개 메소드 Object 자동생성
	// clone() : cloneable을 implements
	
	
	void method() throws Exception {
		
		System.out.println(3);
		System.out.println(0/0);		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//		}catch(Exception e){
//			System.out.println(4);
//			e.printStackTrace();
//		}
//		System.out.println(5);
	}
}
