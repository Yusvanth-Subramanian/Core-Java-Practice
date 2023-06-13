import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormating {

    public static void main(String args[]){

        int number = 123456;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Number in Dollars : "+numberFormat.format(number));

        numberFormat = NumberFormat.getPercentInstance();
        System.out.println("Number in percentage : "+numberFormat.format(0.4));
    }
}
