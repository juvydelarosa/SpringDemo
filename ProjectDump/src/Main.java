import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = new GregorianCalendar();
		c.add(Calendar.YEAR, -15);
		
		for(int i=0; i<25; i++){
			c.add(Calendar.YEAR, 1);
			int j = c.get(Calendar.YEAR);
			System.out.println("Year: " + j );
		}
	}

}
