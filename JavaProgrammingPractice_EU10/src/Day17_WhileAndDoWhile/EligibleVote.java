package Day17_WhileAndDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age=input.nextInt();
        while(!(age>=0&&age<=120)){
            System.err.println("Invalid entry, please re-enter");
            age=input.nextInt();
        }
        String answer=input.next();
        while(!(answer.equals("yes")&&answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizen? yes/no");
            answer=input.next().toLowerCase();
        }
        if(age>=18&&answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

    }
}
