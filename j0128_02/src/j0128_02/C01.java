package j0128_02;

public class C01 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer(9_000_000, 0);
		
		System.out.println("보유금액 : "+b.money);
		System.out.println("보유포인트 : "+b.bonusPoint);		
		System.out.println("---------------------------");
		
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new NoteBook());
		
		for(int i=0;i<b.list.size();i++) {
			//Product p = (Product)b.list.get(i);
			//System.out.println(p.name+","+p.price);
			System.out.println(b.list.get(i).name+","+b.list.get(i).price);
		}
		
		System.out.println("---------------------------");
		System.out.println("보유금액 : "+b.money);
		System.out.println("보유포인트 : "+b.bonusPoint);
	}

}
