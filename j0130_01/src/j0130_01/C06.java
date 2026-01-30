package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C06 {
	
	void FileWriter(String filePath) {
		
		FileWriter fw;
		try {
			fw = new FileWriter(filePath,true); // true : add 기능, false : write
			BufferedWriter bw = new BufferedWriter(fw);
			String txt = "hello world!!\r\n"; // \r 줄의 제일끝으로 이동, \n : 줄바꿈
			bw.write(txt);
			
			bw.close();
			fw.close();
			
			System.out.println("파일저장 완료");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	void FileReader(String filePath) {
		
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				// 1줄씩 읽는다
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}

			br.close();
			fr.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	
	void FileInputStream() {
		
		byte[] b = new byte[1024];
		String filePath = "c:/aaa/a1.txt";
		
		// 2바이트씩 읽어와서 문자를 출력하는 방식(속도 느림)
		try {
			// 파일과 연결통로 생성
			FileInputStream fs = new FileInputStream(filePath);
			int read = 0;
			// 파일을 읽어옴
			while((read=fs.read())!= -1) {// 한글자씩 읽기
				// 파일 출력
				System.out.println((char)read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		try {
//			FileInputStream fs = new FileInputStream(filePath);
//			fs.read(b);
//			System.out.println(new String(b));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
		
	}
	
	void ImageFileCopy() {

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
	
	public static void main(String[] args) {

		String filePath = "c:/aaa/a1.txt";		
		
		C06 c = new C06();

//		파일쓰기
		c.FileWriter(filePath);		
		
//		파일읽기
		c.FileReader(filePath);

//		2byte씩 읽어와서 속도가 느림
		//c.FileInputStream();
		
		// 이미지 파일 복사
		c.ImageFileCopy();
		
	}
	


}
