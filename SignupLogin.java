import java.util.Scanner;

public class SignupLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Details to Signup --- \n");

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your Email ID: ");
        String emailId = sc.nextLine();
        
        System.out.print("Create Username: ");
        String username = sc.nextLine();

        System.out.print("Create Password: ");
        String password = sc.nextLine();

        System.out.println("\n --- Enter Details to Login --- \n");

        System.out.print("Enter your username: ");
        String userEnteredUsername = sc.nextLine();

        System.out.print("Enter your password: ");
        String userEnteredPassword = sc.nextLine();

        if(userEnteredUsername.equals(username) && userEnteredPassword.equals(password)){
            System.out.println("\n--- Login Successful! ---\n");
            System.out.println("Here is your details: ");
            System.out.println("Welcome " + name);
            System.out.println("Email Id: " + emailId);
        }else{
            System.out.println("Invalid Usename or Password!");
        }

        sc.close();
    }
}

