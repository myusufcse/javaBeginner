package date_time_locale;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) throws ParseException {
        Locale localeFr = Locale.FRANCE;
        Locale localeUk = Locale.UK;
        Locale localeUs = Locale.US;
        Locale localeChina = Locale.CHINA;
        Locale current = Locale.getDefault();
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeFr);

        System.out.println(nf.format(12451));
        System.out.println(NumberFormat.getCurrencyInstance(current).format(12451));
        System.out.println(NumberFormat.getCurrencyInstance(localeUk).format(12451));
        System.out.println(NumberFormat.getCurrencyInstance(localeUs).format(12451));
        System.out.println(NumberFormat.getCurrencyInstance(localeChina).format(12451));

        String formattedValue = nf.format(12456);
        System.out.println(formattedValue); // to Format
        BigDecimal parsedValue = BigDecimal.valueOf((Long) nf.parse(formattedValue));
        System.out.println(parsedValue); // to unFormat

    }
}
