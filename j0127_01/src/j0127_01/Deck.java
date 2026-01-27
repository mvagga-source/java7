package j0127_01;

public class Deck {

	// 지역변수를 제외한 클래스변수 및 인스턴스 변수는 초기화됨
	
	String[] kind = {"SPADE", "HAEART", "DIAMOND", "CLOVER"};
	Card[] cd = new Card[Card.Max_kind*Card.Max_number];
	
	Deck() { // 객체 초기화 매서드
		for(int i=0;i<cd.length;i++) {
			cd[i] = new Card(kind[i/13], (i%13)+1 );
		}
	}
	
//	Card[] pick(){
//		Card[] c = {cd[0],cd[1],cd[2],cd[3],cd[4]};
//		return c;
//	}
	
	void shuffle() {
		
		for(int i=0;i<52;i++) {
			int r = (int)(Math.random()*52);
			Card temp = cd[i];
			cd[i] = cd[r];
			cd[r] = temp;
		}
	}
	
	void cardAllPrint() {
		for(int i=0;i<cd.length;i++) {
//			System.out.println(cd[i].kind+","+cd[i].num[cd[i].number]);
			System.out.println(cd[i]);
		}		
	}
	
	void cardAllPrint(int index) {
		for(int i=index;i<5+index;i++) {
			System.out.println(cd[i].kind+","+cd[i].number);
		}		
	}	
	
	void pick() {
		int no = (int)(Math.random()*52);
		System.out.println(cd[no].kind+","+cd[no].number);
	}
	
	
}
