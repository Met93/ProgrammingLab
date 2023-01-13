package Day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int answer=input.nextInt();
        if(answer<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int[]numbers=new int[answer];
        for (int i=0;i<answer;i++){
            System.out.println("Enter a number");
            numbers[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        input.close();
    }
}
