package j0126_01;

public class Deck {
	
	final int CARD_NUM = 52;
	Card[] c = new Card[Card.KIND_MAX*Card.NUM_MAX];
	String[] shape = {"SPADE","HAEART","DIAMOND","CLOVER"};
	
	// 기본생성자
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(); 
			c[i].number = (i%13)+1; // 0,1,2,3 ~
			c[i].Kind = shape[i/13];
		};
	} 
	
	// 카드 1장 뽑기
	Card pick(int index) {
//		if(index>52) {
//			index = index%52;
//			System.out.println(index);
//		}else if(index==0) {
//			index=1;
//		}
		return c[index-1];
	}
	
	Card pick() {
		return c[(int)(Math.random()*(Card.KIND_MAX*Card.NUM_MAX))];
	}
	
	Card[] pick5() {
		//Card[] pick5 = {c[0],c[1],c[2],c[3],c[4]};
		return new Card[]{c[0],c[1],c[2],c[3],c[4]};
	}
	
	void shuffle() {
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
		System.out.println("카드 섞기 완료");
	}
	
	
	
}
