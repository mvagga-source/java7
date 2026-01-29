package j0129_01;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		
		// contains 함수사용
		Scanner scan = new Scanner(System.in);
		
		String[] name = {
			"홍길동","고길동","박길동","이길동","차길동",	
			"최길동","임길동","김길동","한길동","지길동",	
		};
		
		// 홍이 들어가 있는
		
		int temp = 0;
		System.out.println("[검색 출력]");
		for(int i=0;i<name.length;i++) {
//			if(name[i].equals("홍길동")) {
			if(name[i].contains("길")) {
				System.out.println(i+" : "+name[i]);
				temp = 1;
			}
		}
		
		System.out.println("--------------------");
		
		if(temp == 0) {
			
			System.out.println("## 검색된 사람이 없습니다.");
		}else {		
		
			System.out.println("변경 할 사람 번호를 입력 >> ");
			int no = scan.nextInt();
			
			System.out.println("변경 할 이름 입력 >> ");
			name[no] = scan.next();
			System.out.println("## "+name[no]+" 으로 수정 되었습니다.");
			
			for(int i=0;i<name.length;i++) {
				System.out.println(i+" : "+name[i]);
			}			
		}

	}

}
