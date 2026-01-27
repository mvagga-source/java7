package j0126_02;

public class C01 {

	public static void main(String[] args) {

		Deck d = new Deck();
		d.card5print();
		d.card5print(5);
		
		System.out.println("--------------------------");
		
		d.shuffle();
		d.card5print();
		
	}

}
