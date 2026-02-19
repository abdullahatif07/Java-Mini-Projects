import java.util.Scanner;

public class SecureStudentLoginSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "atif07";
        String password = "atif098";

        System.out.print("Enter Username: ");
        String userEnteredUsername = sc.next();
        System.out.print("Enter Password: ");
        String userEnteredPassword = sc.next();

        if(username.equals(userEnteredUsername) && password.equals(userEnteredPassword)){
            System.out.println("\nLogin Successful!");
        }else{
            System.out.println("\nInvalid username or password!");
            return;
        }

        

        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        int ans = 0;
        switch (choice) {
            case 1:
                ans = firstNumber + secondNumber;
                break;
            case 2:
                ans = firstNumber - secondNumber;
                break;
            case 3:
                ans = firstNumber * secondNumber;
                break;
            default:
                break;
        }

        System.out.println("Result = " + ans);
    }
}
