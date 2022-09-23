import java.text.NumberFormat;
import java.util.Scanner;
public class MortageCalculator {

public static void main(String[] args){

final byte MONTHS_IN_YEAR = 12;
final byte PERCENT = 100;



Scanner  input = new Scanner(System.in);
System.out.println("Amount");
float p = input.nextFloat();
System.out.println("Rate");
double r = input.nextDouble();
double montlyIntrest = r/PERCENT/MONTHS_IN_YEAR;
System.out.println("Years");
int n = input.nextInt();
int numberOfPayments = n*MONTHS_IN_YEAR;

double m = (p*((r*Math.pow((1+montlyIntrest),numberOfPayments))/(Math.pow((1+montlyIntrest),numberOfPayments)-1)));

// Mortage = NumberFormat.getCurrencyInstance().format(m);
System.out.println("Mortage: "+m);
}

}