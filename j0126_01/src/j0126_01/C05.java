package j0126_01;

public class C05 {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		
		// 카드한장뽑기
		Card c = d.pick(2);	
		System.out.println(c.number+","+c.Kind);
		
		System.out.println("-------------------------------------");
		
		// 랜덤 카드 1장
		Card c2 = d.pick();	
		System.out.println(c2.number+","+c2.Kind);
		
		System.out.println("-------------------------------------");		
		
		d.shuffle();
		
		Card[] c3 = d.pick5();
		for(int i=0;i<c3.length;i++) {
			System.out.println(c3[i].number+","+c3[i].Kind);
		}
		
		
//		d.c[0].Kind = "SPADE";
//		d.c[0].number = 1;
		
//		for(int i=0;i<d.c.length;i++) {
//			System.out.println(d.c[i].number+","+d.c[i].Kind);
//		}
//		
//		Deck d2 = new Deck();
//		Deck d3 = new Deck();
		
		
		
//		Card[] c = new Card[52];
//		c[0] = new Card();
//		c[0].Kind = "SPADE";
//		c[0].number = 1;  


	}

}
