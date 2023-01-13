package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();
        String email;
        String street;




        // this part is already provided DO NOT CHANGE

        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city");
        String city=scan.next();
        System.out.println("Enter your state");
        String state=scan.next();
        System.out.println("Enter your zip code");
        String zip=scan.next();
        System.out.println("Enter your work phone number");
        String number=scan.next();
        System.out.println("Enter your personal phone number");
        String personalNum=scan.next();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height=scan.nextDouble();
        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        boolean isMarried=true;
        System.out.println("Are you married?");
        System.out.println("Patient personal information");
        System.out.println("Full name: "+firstName+" "+lastName);
        System.out.println("Address: "+street+", "+city+", "+state+" "+zip);
        System.out.println("Contact: work phone number: "+number+", personal phone number: "+personalNum);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married: "+!isMarried);
    }
}
