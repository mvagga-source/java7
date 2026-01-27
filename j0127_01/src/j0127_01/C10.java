package j0127_01;

import java.util.ArrayList;

public class C10 {

	public static void main(String[] args) {

		Card c1 = new Card("SPADE",1);
		// 자동으로 크기 증가, 추가, 수정, 삭제
		// 최초 10개 = 자동으로 10개 증가
		ArrayList list = new ArrayList();
		// 부모의 참조변수 자손의 객체 다루는것
		// list 추가
		list.add(c1);
		list.add(new Card("SPADE",2));
		list.add(new Card("SPADE",3));
		list.add(new Card("SPADE",4));
		list.add(new Card("SPADE",5));
//		list.add(new Stuscore());
		
		
//		Object o = list.get(0);
		Card c = (Card)list.get(0);
		
		// 뒤애서 부터 삭제 진행
		list.remove(4);		
		
		for(int i=0;i<list.size();i++) {
			Card cc = (Card)list.get(i);
			System.out.println(cc.kind+","+cc.number);
		}
	}

}
