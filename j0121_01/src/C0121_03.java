
public class C0121_03 {
	public static void main(String[] args) {
	
		
		int r = (int)(Math.random()*100000);
		String lotto = String.format("%06d", r);
		System.out.println(lotto);
		
		String input = "000005";
		
		for(int i=lotto.length();i >= 0;i-- ) {
			
			switch(i) {
				case 5:
					if(input.charAt(i) == lotto.charAt(i)) {
						System.out.println("500원");
					}
					break;
				case 4:
					if(input.charAt(i) == lotto.charAt(i)) {
						System.out.println("1000원");
					}
					break;
				case 3:
					if(input.charAt(i) == lotto.charAt(i)) {
						System.out.println("10000원");
					}		
					break;
				case 2:
					if(input.charAt(i) == lotto.charAt(i)) {
						System.out.println("10만원");
					}		
					break;
				case 1:
					if(input.charAt(i) == lotto.charAt(i)) {
						System.out.println("100만원");
					}		
					break;
				case 0:
					if(input.charAt(i) == lotto.charAt(i)) {
						System.out.println("1000만원");
					}		
					break;
			}
		}
		
	}
}
