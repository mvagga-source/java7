package j0223_01;

public class C06 {

	static int ii; // 클래스변수, 인스턴스 변수 자동초기화가 됨
	public static void main(String[] args) {
		
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore(1,"홍길동",100,100,99);
//		s[1] = new Stuscore(2,"유관순",90,90,80);
//		
//		for(int i=0;i<2;i++) {
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//				s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
//		}
		
		//int i; 지역변수는 자동초기화가 안됨
		
		Student s = new Student(1,"aaa","1111","홍길동","010-0000-0000","남자","골프,수영");
		Student s1 = new Student(s);
		
		System.out.println(s1.name);
		
		
//		Stuscore stu = new Stuscore();
//		stu.no = 1;
		
//		Car c = new Car();
//		System.out.printf("%s, %s, %d\n",c.color,c.gearType,c.door);
//		
//		Car c1 = new Car("red","stick",4);
//		System.out.printf("%s, %s, %d\n",c1.color,c1.gearType,c1.door);
//		
//		Car c2 = new Car("green","auto",5);
//		System.out.printf("%s, %s, %d\n",c2.color,c2.gearType,c2.door);
//		
//		Car c3 = new Car("gray","stick",3);
//		System.out.printf("%s, %s, %d\n",c3.color,c3.gearType,c3.door);
//		
//		Car c4 = new Car("blue","auto",6);
//		System.out.printf("%s, %s, %d\n",c4.color,c4.gearType,c4.door);

		
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 5;
//		
//		System.out.printf("%s, %s, %d",c.color,c.gearType,c.door);
		
		
	}

}
