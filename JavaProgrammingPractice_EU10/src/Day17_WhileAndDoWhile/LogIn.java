package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String username="Cydeo",
                password="Cydeo123";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String result1= input.nextLine();
        System.out.println("Enter your password: ");
        String result2=input.nextLine();
        int attempt=5;
            while(!(result1.equals(username)&&result2.equals(password))){
                if(attempt>=1&&attempt<=5){
                    System.err.println("Invalid username or password had been written.Please enter it again: ");
                    System.out.println("Enter your username: ");
                    result1= input.nextLine();
                    System.out.println("Enter your password: ");
                    result2=input.nextLine();
                    attempt--;
                    System.out.println("You have " + (attempt-1)+  "  attempts" );
                }else{
                    System.out.println("Your account were locked.");
                    break;
                }
            }
        if(result1.equals(username)&&result2.equals(result2)){
            System.out.println("Log in is successful");
        }
        }

    }

