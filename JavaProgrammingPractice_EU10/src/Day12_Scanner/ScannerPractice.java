package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int numb= input.nextInt();
        String result="";
        if(numb>=1&&numb<=7){
            result=(numb==1)?"Monday":(numb==2)?"Tuesday":(numb==3)?"Wednesday":(numb==4)?"Thursday":(numb==5)?"Friday":(numb==6)?"Saturday":"Sunday";
        }else {
            result="Invalid Number";
        }
        System.out.println(result);
        input.close();
    }
}
