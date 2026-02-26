import java.util.Scanner;

public class VoterOrNot{
    public static void main(String[] args) {
        //Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //Storing result 
        boolean res = isVoter(age);

        //Displaying according to the result
        if(res){
            System.out.println("You are a Voter!");
        }else{
            System.out.println("You are not a Voter!");
        }

        sc.close();
    }

    //Method to check whethe the age is greater than equal to 18 or not
    static boolean isVoter(int age){
        return age >= 18;
    }
}
