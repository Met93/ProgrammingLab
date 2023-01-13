package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <'Z' ; i++) {
            if(i=='F'){
                break;//Exits the loop
            }
            System.out.println(i+" ");
        }

        System.out.println("------------");
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter a number");
            int num=input.nextInt();
            if(num<0){
                break;
            }
        }
    }
}
