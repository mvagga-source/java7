package j0130_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
		
		// 컬렉션 프레임워크
		// 컬렉션 상속 : list(중복 가능), set(중복 안됨 : for문 사용안함) 
		// map(key,value : for문 사용안함)
		
		ArrayList list = new ArrayList(); // 객체선언
		List list2 = new ArrayList(); // 다형성
		
		list.add(11); // int -> integer -> Object
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		// 삭제
		list.remove(3);
				
		
		// 출력
		System.out.println("--------------------------");
		
		for(int i=0;i<list.size();i++) {
			int no = (int)list.get(i);
			System.out.println(no);
		}

		System.out.println("--------------------------");
		
		// for-each
		for(Object l : list) {
			System.out.println((int)l);
		}
		
		System.out.println("--------------------------");

		// Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			int list_data = (int)(it.next());
			System.out.println(list_data);
		}
		
		System.out.println("--------------------------");		
		

	}

}
