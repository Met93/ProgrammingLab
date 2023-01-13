package Day18_NestedLoop;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
         */
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int num1=input.nextInt();
            if(num1%2==0){
                System.out.println("Even Number");
            }else {
                System.out.println("Odd Number");
            }
            System.out.println("Would you like to enter another number?");
            String answer=input.next().toLowerCase();
            while(!(answer.equals("no")||answer.equals("yes"))){
                System.out.println("Invalid answer has been written,Please re-enter it");
                answer=input.next().toLowerCase();
            }
            if(answer.equals("no")){
                break;
            }


        }
        input.close();
    }
}
