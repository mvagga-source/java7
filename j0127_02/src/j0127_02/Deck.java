package j0127_02;

import java.util.ArrayList;

public class Deck {
	
	String name="홍길동";
	int money = 60000;
	int bonusPoint;
	
	ArrayList list = new ArrayList();
	
	void buy(Product p) {
		list.add(p);
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.printf(" ## ( %s ) 구매 완료 ##\n",p.name);
	}

}
