package j0127_01;

public class Card {
	
	static final int Max_kind = 4;
	static final int Max_number = 13;
	
	String kind;
	int number;	
	String[] num = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	Card(){} // 생성자
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
				
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
//		return kind+","+num[number];
		return String.format("[ %s,%s ] ", kind,num[number]);
	}
}
