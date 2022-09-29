
import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalc {
    public static void main(String[] args){
        DecimalFormat format = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many are in your group: ");
        int groupamount = scan.nextInt();
        System.out.print("What is the percentage of the tip: ");
        int percentage = scan.nextInt();
        System.out.print("Enter the cost in dollars and cents. Press -1 when done: ");
        double cost = scan.nextDouble();
        double PriceBeforeTip = 0;
        while (cost != -1){
            PriceBeforeTip += cost;
            System.out.print("Enter the cost in dollars and cents. Press -1 when done: ");
            cost = scan.nextDouble();
        }
// calculates all values from given info.
        String Formattedprice = format.format(PriceBeforeTip);
        double Totaltip = (PriceBeforeTip * percentage);
        String Formattedtip = format.format(Totaltip);
        double Totalprice = (PriceBeforeTip + Totaltip);
        String Formattedpric = format.format(Totalprice);
        double PricePerPerson = (PriceBeforeTip / groupamount);
        String FormattedPPP = format.format(PricePerPerson);
        double TipPerPerson = (Totaltip / groupamount);
        String FormattedTipPP = format.format(TipPerPerson);
        double TotalCostPerPerson = (PricePerPerson + TipPerPerson);
        String FormattedTot = format.format(Totalprice);
// Prints out all information inputted
        System.out.println("The total before tip is: " + Formattedprice);
        System.out.println("The percentage of the tip is: " + percentage);
        System.out.println("The total with tip: " + Formattedtip);
        System.out.println("The entire bill is: " + Formattedpric);
        System.out.println("The cost per person with out tip is: " + FormattedPPP);
        System.out.println("The tip per person is: " + FormattedTipPP);
        System.out.println("Total cost per person is: " + FormattedTot);
    }
}