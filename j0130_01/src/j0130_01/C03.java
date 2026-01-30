package j0130_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C03 {

	public static void main(String[] args) {

//		HashMap<String,Object> map = new HashMap<String,Object>();
		
		Map<String, Object> map = new HashMap();
		List list = new ArrayList();
		List list2 = new ArrayList();
		int[] arr = {1,2,3};
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		map.put("name", "홍길동");
		map.put("memberList", list);
		map.put("boardList", list2);
		System.out.println(map.get("memberList"));
		
		// 전체출력 - map은 list를 상속하지 않기때문에  Iterator를 사용할수 없음
		// map은 set으로 변경해서 Iterator를 사용한다
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
//		HashSet set = new HashSet();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(3);
//		set.add(6);
//		set.add(7);
		
		
	}

}
