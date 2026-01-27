package j0126_03;  // package : 폴더

public class C01 {

	public static void main(String[] args) {

		Deck d1 = new Deck();
		Card[] cd = d1.pick();
		for(int i=0;i<cd.length;i++) {
			System.out.println(cd[i].kind+","+cd[i].number);
		}

	}

}
