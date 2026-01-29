package j0129_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06 {

	public static void main(String[] args) {

		FileReader fr = null;
		try {
//			FileInputStream fs = new FileInputStream("c:/aaa/a1.txt");
			fr = new FileReader("c:/aaa/a1.txt");
			int data = 0;
			while((data = fr.read()) != -1) {
				// 2Byte 1단어
				System.out.println((char)data);
			}
		} catch (IOException e) { // 주의
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
