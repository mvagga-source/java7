package j0126_02;

public class Deck {
	
	String[] kind = {"SPADE", "HAEART","DIAMOND","CLOVER"};
	Card[] c = new Card[52];
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card((i%13)+1, kind[i/13]);
		}		
	}
	
	void card5print() {
		for(int i=0;i<5;i++) {
			System.out.println(c[i].number+","+c[i].kind);
		}				
	}
	
	void card5print(int index) {
		for(int i=index;i<index+5;i++) {
			System.out.println(c[i].number+","+c[i].kind);
		}				
	}
	
	void shuffle() {
		for(int i=0;i<1000;i++) {
			int no = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[no];
			c[no] = temp;
		}
	}
}
