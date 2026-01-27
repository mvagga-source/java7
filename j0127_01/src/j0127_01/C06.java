package j0127_01;

public class C06 {

	public static void main(String[] args) {

		CationTv c1 = new CationTv();
		System.out.println(c1.text);
		System.out.println(c1.channel);
		System.out.println(c1.power);
		c1.power();

		// 다형성
		Tv t2 = new CationTv();


		

	}

}
