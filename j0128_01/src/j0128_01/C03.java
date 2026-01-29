package j0128_01;

import java.util.ArrayList;

public class C03 {

	public static void main(String[] args) {

		// 제너릭 (같은 타입만 입력하는 방식)
		ArrayList list = new ArrayList();
		
		list.add(new Stuscore("홍길동",100,100,99));
		list.add(new Stuscore("고길동",100,90,99));
		list.add(new Stuscore("최길동",77,100,99));
		
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
//			System.out.println(s.name);
		}

	}

}
