import java.util.Scanner;

//Program to Calculate Zakat amount
public class ZakatCalculator{
    public static void main(String[] args) {
        //Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking total Wealth as input
        System.out.print("Enter your total wealth: ");
        double wealth = sc.nextDouble();

        //Calculating Zakat amount
        double zakatAmount = (wealth * 2.5) / 100.0;

        //Displaying Zakat Amount
        System.out.println("Zakat Amount = " + zakatAmount);

        //Closing Scanner object
        sc.close();
    }
}
