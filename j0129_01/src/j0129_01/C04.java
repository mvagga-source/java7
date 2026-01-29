package j0129_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C04 {

	public static void main(String[] args) {
		
		try {
			// 외부에서 파일을 읽어오기 때문에 try~catch 선언이 되어야 함
			FileReader fr = new FileReader("C:\\aaa\\a1.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null)break;
				System.out.println(line);
			}
			
			
//		} catch (FileNotFoundException e) {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		
		
//		TryClass t = new TryClass();
//		try {
//			t.method();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			t.method(); // 마우스 올리면 자동으로 try catch 적용됨
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println("프로그램을 종료");

	}

}
