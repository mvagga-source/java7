package j0128_01;

public class C04 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		System.out.println(b.userName+"님 환영합니다.");
		System.out.println("보유금액 : "+b.money);
		System.out.println("보너스 포인트 : "+b.bonusPoint);
		System.out.println("--------------------------------");
		
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new NoteBook());
		
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product)b.list.get(i);
			System.out.println(p.name+","+p.price+","+p.bonusPoint);
		}
		
		System.out.println("--------------------------------");		
		System.out.println("총 구매개수 : "+b.list.size());
		System.out.println("보유금액 : "+b.money);
		System.out.println("보너스 포인트 : "+b.bonusPoint);
		


	}

}
