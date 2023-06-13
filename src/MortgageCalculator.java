import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double p = scanner.nextDouble();
        System.out.print("Enter rate of interest : ");
        double r = scanner.nextDouble()/100/12;
        System.out.print("Enter time in years : ");
        int n = scanner.nextInt()*12;
        double t = Math.pow((1+r),n);
        double m = p*((r*t)/(t-1));
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Mortgage : "+numberFormat.format(m));
    }
}
