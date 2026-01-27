package j0126_03;

public class Deck {

	// 지역변수를 제외한 클래스변수 및 인스턴스 변수는 초기화됨
	
	String[] kind = {"SPADE", "HAEART", "DIAMOND", "CLOVER"};
	Card[] cd = new Card[Card.Max_kind*Card.Max_number];
	
	Deck() { // 객체 초기화 매서드
		for(int i=0;i<cd.length;i++) {
			cd[i] = new Card(kind[i/13], (i%13)+1 );
		}
	}
	
	Card[] pick(){
		Card[] c = {cd[0],cd[1],cd[2],cd[3],cd[4]};
		return c;
	}
	
	
}
