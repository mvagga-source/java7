package j0223_01;

public class C0123_02 {

	public static void main(String[] args) {
		
		Card c = new Card();
		
		c.kind = "SPADE";
		c.number = 1;
		
		// 클래스명
		Card.width = 200;
		Card.height = 300;

		
		Card c2 = new Card();
		
		System.out.println(c2.width);
		
	}

}
