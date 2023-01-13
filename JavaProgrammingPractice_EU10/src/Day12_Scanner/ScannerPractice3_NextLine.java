package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name: ");
        String schoolName=input.nextLine();
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(schoolName);
    }
}
