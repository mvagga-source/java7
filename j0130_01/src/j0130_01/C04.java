package j0130_01;

import java.util.ArrayList;
import java.util.Iterator;

public class C04 {

	public static void main(String[] args) {
		// 지네릭스
		ArrayList<Card> list = new ArrayList();
		
		Card c1 = new Card("SPADE",1);
		Card c2 = new Card("SPADE",2);
		Card c3 = new Card("SPADE",3);
		
		Stuscore s1 = new Stuscore("홍길동",100,99,100);
		Stuscore s2 = new Stuscore("박길동",100,88,100);
		Stuscore s3 = new Stuscore("고길동",100,77,100);
		
		String str1 = "박길자";
		String str2 = "홍길자";
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(str1);
//		list.add(str2);
		
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i) instanceof Card) {
//				Card c = (Card)list.get(i);
//				System.out.println(c.kind+","+c.number);				
//			}
//		}
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//
//			if ( it.next() instanceof Card ) {
//				Card c = (Card)it.next();
//				System.out.println(c.kind+","+c.number);
//			}
//		}
		

	}

}
