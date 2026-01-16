package j0116_01;

public class Class0116_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean
		boolean aa = true;
		boolean aa2 = false;
//		System.out.println(aa);
		
		// char 
		char bb = 'a';
		char bb2 = '1';
		
//		System.out.print(bb);
		
		//byte
		byte cc = 1;
		byte cc2 = 127;
		byte cc3 = (byte) 128;
		
		System.out.println(cc3);
		
		short dd = 1;
		System.out.println(dd);
		
		int ee = 1;
		int ee2 = 210_000_000;
		
		System.out.println(ee2);
		
		long ff = 1;
		long ff2 = 220_000_000L; // 접미사 L을 붙여야 함   21억 밑으로는 생략가능  이상은 L을 붙여야 함 
		
		System.out.println(ff2);
		
//		실수 - float, doubl
		float gg = 1.12345678F; // 접미사 F를 붙여야 함
		double hh = 1.123456789123456789; // 접미사 D는 생략가능
		
		
//		--------------------------------------------------------
		
		
//		참조형 변수(객체변수) - 무조건 new객체명()  - 앞글자는 무조건 대문자로 표기
//		문자열 변수 - 일반형 변수처럼 선언가능
		String str = new String("aaa");
		String str2 = "bbb";
		System.out.println(str);
		
		
		int abc = 10;
		abc = 20;
		abc = 30;
		System.out.println(abc);
		
		final int AA = 100;
//		AA = 20; // 대문자로 표기해서 상수로 인식 가능하도록 함
		
		char ch = '\u0041';
		System.out.println(ch);
		
		
	}

}
