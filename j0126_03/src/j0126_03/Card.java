package j0126_03;

public class Card {
	String kind;
	int number;
	
	static final int Max_kind = 4;
	static final int Max_number = 13;
	
	Card(){}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
				
	}
}
