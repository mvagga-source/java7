package j0127_01;
import java.util.Calendar;

public class C03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getNum());
		
		Singleton s2 = Singleton.getInstance();
		s1.setNum(100);
		System.out.println(s2.getNum());
		System.out.println(s1.getNum());
		

//		Date d = new Date();
//		System.out.println(d);
//		
//		Date d2 = new Date();
//		System.out.println(d2);
//		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		
	}

}
