import java.util.Scanner;

//This is a mini java project which will tell whether the given number is odd or not
public class OddChecker {
    public static void main(String[] args) {
        //Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking number as input
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        //storing result in a boolean variable res
        boolean res = isOdd(num);

        //Displaying output according to the answer
        if(res) System.out.println(num + " is an odd number!");
        else System.out.println(num + " is not an odd number!");

        sc.close();
    }

    //Method to check whether a number is even or not
    static boolean isOdd(int n){
        return n%2 != 0;
    }
}
