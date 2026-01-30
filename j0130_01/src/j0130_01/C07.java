package j0130_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("c:/aaa/nct1.jpg");
		try {
			// 파일 읽기
			FileInputStream fis = new FileInputStream(f);
			// 파일 저장
			FileOutputStream fos = new FileOutputStream("c:/bbb/nct11.jpg");
			
			while(true) {
				int read = fis.read();
				if(read == -1) break;
				fos.write(read);
			}
			
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
