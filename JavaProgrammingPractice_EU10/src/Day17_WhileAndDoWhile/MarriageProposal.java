package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Will you marry me?");
        String a=input.next().toLowerCase();
        while(!(a.equals("yes"))||a.equals("no")){
            System.out.println("Invalid asnwer, please re-enter");
            a=input.next().toLowerCase();
        }
        if(a.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
