import java.util.Scanner;

//Program to check if a number given by user is Prime Number or not

public class PrimeNumberChecker{

    //main method
    public static void main(String[] args) {
        //Creating Object of Scanner class to take input from user
        Scanner sc = new Scanner(System.in);

        //Displaying about the purpose of this program
        System.out.println("\nThis Program is to check whether the given number is Prime Number or Not \n");

        //Displaying to tell the user to give input
        System.out.print("Enter number: ");

        //taking input from user and storing it to num variable
        int num = sc.nextInt();

        //Calling isPrime method and storing the result to res variable
        boolean res = isPrime(num);

        //Checking the what res stored and displaying according to that
        //if res stored true that means number is a prime number
        if(res == true){
            System.out.println(num + " is a Prime number!"); //Displaying the given number is a Prime number
        }else{
            System.out.println(num + " is not a Prime number!"); //Displaying the given number is not a Prime Number
        }

        sc.close(); //closing the scanner class object sc
    }

    //Creating a method to check whether the given number is prime or not
    //if the number is prime number it will return true otherwise false

    static boolean isPrime(int n){
        //Base condition
        if(n <= 1) return false;

        //Iterating through the loop
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
