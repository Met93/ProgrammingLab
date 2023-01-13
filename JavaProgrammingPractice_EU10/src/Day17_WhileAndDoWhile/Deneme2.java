package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int seconds=input.nextInt();
        int InOneSecond=60;
        int InOneMinute=60;
        int hours=InOneMinute*InOneSecond;
        int hour=seconds/(InOneMinute*InOneSecond);
        int minute=(seconds-(hours*hour))/InOneMinute;
        int second=(seconds-(hours*hour)-(minute*60));
        System.out.println(hour+" hours, "+minute+" minutes, and "+second+ " seconds");



    }
}
