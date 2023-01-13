package Day21_ArrayLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        char[]result1=str1.toCharArray();
        Arrays.sort(result1);
        String str2="dbca";
        char[]result2=str2.toCharArray();
        Arrays.sort(result2);
        boolean anagram=Arrays.equals(result1,result2);
        System.out.println(anagram);
        for (char each: result1) {
            for (char c : result2) {
                if(each==c){
                    System.out.println("Same");
                }
            }
        }
        //write a program that can check if str1 and str2 are build out same characters
        String sentence="Wooden Spoon";
        String []words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("-------------------------");
        String email="WoodenSpoon@cydeo.com";
        String[]emails=email.split("@");
        System.out.println(Arrays.toString(emails));
        System.out.println("---------------------");
        String s="Today is nice day. Today is Monday.Today we learn Java";
        String []arr1=s.split("\\. ");
        System.out.println(Arrays.toString(arr1));
        
    }
}
