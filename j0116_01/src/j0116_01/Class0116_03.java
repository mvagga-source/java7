package j0116_01;

public class Class0116_03 {

	public static void main(String[] args) {

		System.out.println("hi");
		System.out.println("lknflaw");

		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041';
		char tab = '\t';

		System.out.println(ch2);
		System.out.println(tab);

		float f = 100f;
		System.out.println(f);

//		3.14e3f = 3.14 x e = 10, 3 = 3승 지수표현식
		
		char ch4 = 'a';
//		char ch5 = 'aa';
		
		// ''
//		char ch5 = ''; 
		char ch6 = ' '; // 공백문자는 가능
		
		String str = ""; // ""넣지 않는 것 가능
		
		// 문자열은 모든 타입을 포함 시킬수 있음
		
		String str2 = "7";
		System.out.println("7"+7+7); // 문자열을 만나면 문자열로 변환 됨
		System.out.println(""+7+7); // 문자열을 만나면 문자열로 변환 됨
		System.out.println(7+7+"7");
		
		String str3 = "aaa";
		System.out.println(str3+7);
		
		int a = 7;
		int b = 8;
		String str4 = "7";
		System.out.println(a+8+str4);
		
		
		

	}

}
