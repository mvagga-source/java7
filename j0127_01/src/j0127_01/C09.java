package j0127_01;

public class C09 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		System.out.println("현재 회원명 : "+b.name);
		System.out.println("현재 보유금액 : "+b.money);
		System.out.println("현재 보유포인트 : "+b.bonusPoint);
		
		
		System.out.println("1. 삼성TV");
		System.out.println("2. 그램노트북");
		System.out.println("3. 하만오디오");
		
//		PTv p1 = new PTv();
		b.buy(new PTv());
		b.buy(new NoteBook());
		b.buy(new Audio());
		b.buy(new PTv());
		
		System.out.println("--------");
		System.out.println("구매물품 : ");
//		for(int i=0;i<b.count;i++) {
//			System.out.println(b.cart[i].name);
//		}
		
		for(int i=0;i<b.list.size();i++) {
		 	Product p = (Product)b.list.get(i);
		 	System.out.println(p.name);
		}
		
		System.out.println();
		
		System.out.println("현재 보유금액 : "+b.money);
		System.out.println("현재 보유포인트 : "+b.bonusPoint);		

	}

}
