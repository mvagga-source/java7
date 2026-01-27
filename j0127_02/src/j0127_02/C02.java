package j0127_02;

public class C02 {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		
		d.buy(new Audio());
		d.buy(new PTv());
		d.buy(new Phone());
		
		System.out.println("구매한 물품 : ");
		for(int i=0; i<d.list.size();i++) {
			Product p = (Product)d.list.get(i);
			System.out.println(p.name);
		}
		
		System.out.println(d.name+"의 현재 자산");
		System.out.println("남은 금액 : "+d.money);
		System.out.println("남은 포인트 : "+d.bonusPoint);

	}

}
