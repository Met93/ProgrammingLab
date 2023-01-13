package week04_10_1_2022;

public class Devisible {
    public static void main(String[] args) {
        /*
        Task 1:
  Write a function:
            that, given a positive integer N  However,
            any number divisible by 2, 3 or 5 shouldbe replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5

            - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

                                EXPECTED

                        numbers divisible by both 2 and 3 should be replacée by CodilityTest
                        INPUT : 6    OUTPUT :  CodilityTest

                        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
                        INPUT : 30    OUTPUT :  CodilityTestCoders
﻿
         */
//we will get one number from the user(create a varible)positive
        //we will create a varieble in order to put our result in it
        //we will check number is positive or negative
        //if the number is positive we will check the number divisible by2 we put the codility inside varible
        int number=65;
        String result=(number>0)?(number%2==0)?"Codility":(number%3==0)?"Test":(number%5==0)?"Coders":(number%6==0)?"CodilityTest":(number%30==0)?"CodilityTestCoders":"There is no another option":"Invalid number";
        System.out.println(result);
        String result2="";
        if(number>0){
            if(number%2==0){
              result="Codility";
            }
            if(number%3==0){
                result="Test;";
            }
            if (number%5==0){
                result="Coders";
            }
            if(number%6==0){
                result="CodilityTest";
            }
            if(number%30==0){
                result="CodilityTestCoders";
            }

        }else {
           result="Invalid Number has given";
        }
        System.out.println(result);
    }
}
