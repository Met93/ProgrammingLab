package Day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter our age: ");
        int age= input.nextInt();
        System.out.println("Enter your Gender: ");
        String gender= input.next();
        input.nextLine();// you have to use nextline method when you want to use it.
        System.out.println("Enter your full Name: ");
        String  fullName= input.nextLine();
        System.out.println("Enter your full number: ");
        long phoneNumber=input.nextLong();
        System.out.println("Enter your zip code: ");
        int zipCode=input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name: ");
        String schoolName=input.nextLine();
        System.out.println("Enter your city name: ");
        String city= input.nextLine();
        System.out.println("Enter your state name: ");
        String state=input.nextLine();
        System.out.println("Enter your building number: ");
        int buildungNum=input.nextInt();
        input.nextLine();
        System.out.println("Enter your Street name: ");
        String street=input.nextLine();
        input.close();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address:  = " +"\n\t"+buildungNum+""+street+"\n\t"+city+", "+state+ " "+zipCode );

    }
}
