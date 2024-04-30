import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //NumberFormat.getCurrencyInstance().format();
       // String result = Principal.format(System.in);
       Scanner scanner = new Scanner(System.in);
       System.out.print("Principal: ");
       double principal = scanner.nextDouble();
       NumberFormat principalFormat = NumberFormat.getCurrencyInstance();
       String resultPrincipal = principalFormat.format(principal);

       //Interest Rate
       System.out.print("Annual Interest Rate (%): ");
       double interest = scanner.nextDouble();
       NumberFormat interestFormat = NumberFormat.getNumberInstance();
       String resultInterest = interestFormat.format(interest);

       //Period in Years
        System.out.print("Period in Years or Term : ");
        double term = scanner.nextDouble();
        NumberFormat termFormat = NumberFormat.getNumberInstance();
        String resultTerm = termFormat.format(term);

        //Solution

        final double Percent = 100;
        final double numberOfMonths = 12;
        double r = ((interest/ Percent)/numberOfMonths);
        double rPlusOne = r + 1;
        double numberOfPayments = term * numberOfMonths;
        double rPlusOneToNthPow = Math.pow(rPlusOne, numberOfPayments);
        double numerator = r * rPlusOneToNthPow;
        double denominator = rPlusOneToNthPow - 1;
        double mortgage = (numerator/ denominator) * principal;

       // mortgage = scanner.nextDouble();
        NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance();
        String resultMortgage = mortgageFormat.format(mortgage);

        double resultRate = (mortgage * numberOfPayments);
        NumberFormat resultRateAddedFormat = NumberFormat.getCurrencyInstance();
        String resultRateAdded = resultRateAddedFormat.format(resultRate);


        System.out.print("Principal is " + resultPrincipal + ".");
        System.out.print(" Interest Rate is " + interest + "% .");
        System.out.print(" Term is " + resultTerm + " years.");
        System.out.println(" Mortgage is " + resultMortgage +   ".");
        System.out.print("That makes the Total Mortgage with the Principal equal to " + resultRateAdded + ".");


    }
}