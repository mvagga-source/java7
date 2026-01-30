package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		StuDeck s = new StuDeck();
		
		loop:while(true) {
			
			s.screen();
			int choice = s.scan.nextInt();
			
			switch(choice) {
			case 1:
				s.stuInput();
				break;
			case 2:
				s.stuPrint();
				break;
			case 4:
				s.stuDelete();
				break;
			case 8:
				s.fileOpen();
				break;
			case 9:
				s.fileSave();
				break;
			case 0:
				System.out.println("## 프로그램 종료");
				break loop;
				
			} // switch
			
		} // while
		

	}

}
