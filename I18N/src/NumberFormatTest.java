import java.text.NumberFormat;
import java.util.Locale;


public class NumberFormatTest {

	public static void main(String[] args) {
		Double d = 6123456.786789;
		
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		nf.setMaximumFractionDigits(3);
		nf.setMaximumFractionDigits(4);
		
		
		System.out.println(nf.format(d));
	}

}
