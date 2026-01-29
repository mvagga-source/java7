package j0128_01;

import java.util.ArrayList;

public class Buyer {
	
	String id;
	String pw;
	String userName;
	int money;
	int bonusPoint;
	ArrayList list = new ArrayList();
	
	Buyer(){
		id="aaa";
		pw = "1111";
		userName = "홍길동";
		money = 10_000_000;
		bonusPoint = 0;
	}
	
	void buy(Product t) {
		money = money - t.price; //구매금액만큼 보유금액 차감
		bonusPoint += t.bonusPoint; // 보너스포인트 추가
		
		list.add(t); // 상품추가
	}
	
//	void buy(Audio t) {
//		money = money - t.price; //구매금액만큼 보유금액 차감
//		bonusPoint += t.bonusPoint; // 보너스포인트 추가
//		
//		list.add(t); // 상품추가
//	}
	
}
