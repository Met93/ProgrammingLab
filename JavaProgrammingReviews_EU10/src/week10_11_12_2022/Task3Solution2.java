package week10_11_12_2022;

import java.util.Arrays;

public class Task3Solution2 {
    /*
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
       //I need to get each String
       //I need tı get each digit
       //I can use parseInt method
        String []array={"123","134","513"};
        for (String each : array) {
           String[]eachDigit=each.split("");
           int total=0;
            for (String s : eachDigit) {
                int i = Integer.parseInt(s);
                total+=i;
            }
            System.out.println(Arrays.toString(eachDigit));
            System.out.println(total);

        }
    }
}
