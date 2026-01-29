package j0128_02;

public class C02 {

	public static void main(String[] args) {

		StuDeck s = new StuDeck();

		
		loop:while(true) {
			
			s.stuMenu(); //매뉴 출력
			System.out.println("원하는 번호를 입력 >> ");
			int choice = s.scan.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.out.println("## 프로그램 종료");
				break loop;
				
			}//switch
			
		}//while
		
	}// main

}
