package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class LogInMuhtaR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u=input.next();
        System.out.println("Enter your password: ");
        String p=input.next();
        if(u.equals("Cydeo")&&p.equals("Cydeo123")){// if credentials are valid
            System.out.println("Logged in");
        }else{//if credentials are not valid
            int attempts=3;
            while(!(u.equals("Cydeo")&&p.equals("Cydeo123"))&&attempts>0){//while the credentials are invalid, an
                System.out.println("Incorrect username or password.Please re-enter");
                System.out.println("Enter your username: ");
                u=input.next();
                System.out.println("Enter your password: ");
                p=input.next();
                attempts--;
            }
            if(u.equals("Cydeo")&&p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }
        input.close();
    }
}
