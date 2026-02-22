// Project Title: Secure Student Login System with Arithmetic Module

import java.util.Scanner;
public class SecureStudentLoginSystem{
    public static void main(String[] args) {
        //Creating object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        //Storing predefined credentials
        String predefinedUsername = "atif07";
        String predefinedPassword = "atif@dce07";

        //Asking user to enter username and password
        System.out.print("Enter Username: ");
        String userEnteredUsername = sc.next();

        System.out.print("Enter Password: ");
        String userEnteredPassword = sc.next();

        //Checking whether the username and password is correct or not which user has entered
        if(!login(predefinedUsername, predefinedPassword, userEnteredUsername, userEnteredPassword)){
            sc.close();
            return;
        }

        //Performing Arithmetic Operation
        while(true){
            //Displaying Menu
            System.out.println("\n---- MENU ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");

            //Taking user choice
            System.out.print("\nEnter choice: ");
            int choice = sc.nextInt();

            //checking whether user wants to exit
            if(choice == 4){
                System.out.println("Program terminated successfully.");
                break;   
            }
            //Checking whether user has entered invalid choice
            if(choice < 1 || choice > 3){
                System.out.println("Invalid choice!");
                continue;
            }

            //Taking two numbers as input
            System.out.print("Enter First Number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int secondNumber = sc.nextInt();

            //Storing result
            int res = arithmeticOperations(firstNumber, secondNumber, choice);
            //Displaying result
            System.out.println("Result = " + res);
        }
        //Closing scanner
        sc.close();
    }

    //Method to check whether the username and password which user has entered is matching the predefined username and password or not
    static boolean login(String predefinedUsername, String predefinedPassword, String userEnteredUsername, String userEnteredPassword){

        if(userEnteredUsername.equals(predefinedUsername) && userEnteredPassword.equals(predefinedPassword)){
            System.out.println("\nLogin Successful");
            return true;
        }else{
            System.out.println("\nAccess Denied");
            return false;
        }

    }

    //Method for Performing Arithmetic Operation according to the user choice
    static int arithmeticOperations(int num1, int num2, int choice){
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
        }

        return 0;//this will never execute
    }
}

