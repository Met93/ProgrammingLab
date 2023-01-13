package week10_11_12_2022;

import java.util.Arrays;

public class Task3SumNumbers {
    /*
    String numbers to sum

                    Given an Array of numbers in String format, add each digit of each element and store into a different Array.

                    Ex:

                    Input:
                    “123”, “134”, “513”

                    Output:
                    [ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        String []array={"123","134","513"};
        int[]result=sumNumbers(array);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sumNumbers(String[] array) {
        int[]result=new int[array.length];
        int index=0;
        for (String each : array) {
            int i = Integer.parseInt(each);
            int sumOfDigits=sumDigits(i);
           result[index++]=sumOfDigits;
        }
        return result;
    }

    public static int sumDigits(int i) {
        int lasDigit=i%10;
        int middleDigit=i/10%10;
        int firstDigit=i/100;
        return firstDigit+middleDigit+lasDigit;
    }
}
