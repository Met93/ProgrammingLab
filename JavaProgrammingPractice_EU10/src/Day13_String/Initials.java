package Day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name=input.next();
        System.out.println("Enter your last name: ");
        String lastName=input.next();
        input.close();
        char f=name.charAt(0);
        char l=lastName.charAt(0);
        String initial=f+"."+l;
        System.out.println(initial);
    }
}
