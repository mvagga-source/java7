package j0223_01;

public class Car {
	
	Car(){
		this("white","auto",5);
	}
	
//	Car(String c, String g,int d){
//		color = c;
//		gearType = g;
//		door = d;
//	}
	
	
	// 매개변수, 지역변수, 인스턴스변수명이 동일시 this를 지정하여 구분한다
	Car(String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}	
	
	String color;
	String gearType;
	int door;
}
