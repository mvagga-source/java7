package j0129_01;

public class Person {
	long id;
	String name;
	
	Person(){}
	Person(long id,String name){
		this.id = id;
		this.name = name;
	}
	
	Person(Person p){
		this.id = p.id;
		this.name = p.name;
	}
	
	@Override // 객체를 출력하면 toString을 가장먼저 호출
	public String toString() {
		
//		return ""+id+","+name;
		return String.format("%d,%s", id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(this.id == ((Person)obj).id) {
		if(this.name.equals(((Person)obj).name)) {
			return true;
		}
		return false;
	}
}
