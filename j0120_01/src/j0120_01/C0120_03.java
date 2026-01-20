package j0120_01;

public class C0120_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = "['게임','골프','수영','조깅','독서']";
//		String str2 = "['수영','조깅','독서']";
//		String str3 = "['게임','골프','독서']";
//		String str4 = "['게임','수영','조깅','독서']";
//		String str5 = "['게임','골프','독서']";
//		
//		// 수영 포함된 문자열 출력
//		if(str3.contains("수영")) System.out.println("존재");
//		else System.out.println("미존재");
		
		
		//String 타입 등가비교가 안됨
		// 객체타입  .equals()
		
		String str1 = "10";
		String str2 = "100";
		String str3 = new String("10");
		
//		if(str1==str3) {
		if(str1.equals(str3)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
		
		
	}

}
