package j0129_01;

public class C01 {

	public static void main(String[] args) {
		
		StuDeck s = new StuDeck();
		
		loop:while(true) {
			
			s.stuMenu(); //매뉴 출력
			System.out.println("원하는 번호를 입력 >> ");
			int choice = s.scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				s.stuInput();
				break;
			case 2:
				s.stuUpdate();
				break;
			case 3:
				s.stuPrint();
				break;
			case 4:
				s.stuDelete();
				break;
			case 0:
				System.out.println("## 프로그램 종료");
				break loop;
				
			}//switch
			
		}//while		

	}

}
