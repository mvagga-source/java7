package j0223_01;

public class Student {
	
	public Student(int no, String id, String pw, String name, String phone, String gender, String hobby) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	Student(Student s){
		this.no = s.no;
		this.id = s.id;
		this.pw = s.pw;
		this.name = s.name;
		this.phone = s.phone;
		this.gender = s.gender;
		this.hobby = s.hobby;
		
	}
	
	Student(){}

	
	int no;
	String id;
	String pw;
	String name;
	String phone;
	String gender;
	String hobby;
}
