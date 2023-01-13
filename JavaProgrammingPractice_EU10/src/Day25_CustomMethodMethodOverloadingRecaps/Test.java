package Day25_CustomMethodMethodOverloadingRecaps;

import Utilities.StringUtility;

import static Utilities.StringUtility.*;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        printEachChar(str);
        System.out.println("----------------------");
        String s1="Wooden Spoon";
        System.out.println(reversed(s1));
        //String reverse= StringUtility.reversed(s1);
        //sout.reversed
        String word="Anna";
        boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("----------------------");
        String []names={"Anna","Java","Python","racacar","Mom","Cydeo"};
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        String s2="aaaaabbbbccccdddd";
        String s3=StringUtility.removedDublicates(s2);
        System.out.println(s3);


    }

}
