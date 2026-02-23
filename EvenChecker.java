import java.util.Scanner;

//This is a mini java project which will tell whether the given number is even or not
public class EvenChecker {
    public static void main(String[] args) {
        //Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking number as input
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        //storing result in a boolean variable res
        boolean res = isEven(num);

        //Displaying output according to the answer
        if(res) System.out.println(num + " is an even number!");
        else System.out.println(num + " is not an even number!");

    }

    //Method to check whether a number is even or not
    static boolean isEven(int n){
        return n%2 == 0;
    }
}

