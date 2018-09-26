import java.text.DateFormat;
import java.util.Locale;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Date d = new Date();
		DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukDF = DateFormat.getDateInstance(0, Locale.UK);
		
		System.out.println(usDF.format(d));
		System.out.println(ukDF.format(d));
	}

}
