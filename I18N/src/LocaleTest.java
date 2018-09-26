import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(Locale.getDefault());

		System.out.println("Country: " + locale.getCountry() + " Language: "
				+ locale.getLanguage());
		
		System.out.println(locale.getDisplayCountry());
		
		System.out.println(locale.getDisplayLanguage());
		
		//System.out.println(locale.getDisplayCountry(locale));
		
		Locale.setDefault(Locale.UK);
		
		System.out.println(Locale.getDefault().getDisplayCountry());
		
		String[] isoCountries = Locale.getISOCountries();
		
		for (String country : isoCountries) {
			System.out.println(country);
		}
		
		String[] languages = Locale.getISOLanguages();
		
		for (String language : languages) {
			System.out.println(language);
		}
	}

}
