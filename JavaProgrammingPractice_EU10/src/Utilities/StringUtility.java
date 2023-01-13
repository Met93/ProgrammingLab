package Utilities;

import java.util.Arrays;

public class StringUtility {
    //print each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    //returns the given String and returns the reversed string
    public static String reversed(String stb){
        String result="";
        for (int i = stb.length()-1; i >=0 ; i--) {
            result+=stb.charAt(i);
        }
        return result;
    }
    //checks if the given Strinf is palindrome,returns boolean
    public static boolean isPalindrome(String str){
        return reversed(str).equalsIgnoreCase(str);
    }
    //checks if the given anagram, returns boolean
    public static boolean anagram(String str1,String str2){
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    //removes the dublicates from the given String,returns String
    public static String removedDublicates(String str1){
        String result="";
        for (int i = 0; i < str1.length(); i++) {
            char each=str1.charAt(i);
            if(!result.contains(each+"")){
                result+=each;
            }
        }
        return result;

    }
    //adds the given element to array,return a new array


}
