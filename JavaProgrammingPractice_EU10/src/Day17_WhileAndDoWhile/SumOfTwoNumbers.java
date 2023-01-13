package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1= input.nextInt();
        System.out.println("Enter the second number: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
        System.out.println("Do you want to continue to calculate?");
        String yanit=input.next();
        boolean kosul=true;
        if (yanit.equalsIgnoreCase("yes")){
            while(kosul){
                System.out.println("Enter the first number: ");
                num1= input.nextInt();
                System.out.println("Enter the second number: ");
                num2=input.nextInt();
                sum=num1+num2;
                System.out.println(sum);
                System.out.println("Do you want to continue to calculate?");
                yanit=input.next().toLowerCase();
                if (yanit.equals("yes")){
                    continue;
                }else{

                    System.exit(1);
                }
            }
        }else{
            System.out.println(sum);
        }


    }
}
