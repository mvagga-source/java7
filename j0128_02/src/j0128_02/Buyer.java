package j0128_02;

import java.util.ArrayList;

public class Buyer {
	
	String userName;
	int money;
	int bonusPoint;
	// 제네릭 사용
	ArrayList<Product> list = new ArrayList<>();
	
	Buyer(){}
	Buyer(int money, int bonuPoint) {
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Product p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
				
		list.add(p);
	}

}
