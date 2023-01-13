package Day13_String;

import java.util.Locale;

public class StrinMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        char thirdChar=word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        char tenthChar=word.charAt(4);
        System.out.println("tenthChar = " + tenthChar);
        // length()=total number of characters
        String s1="Batch 25 is the best batch";
        int totalChars=s1.length();
        System.out.println(totalChars);
        char lasChar=s1.charAt(s1.length()-1);
        System.out.println("lasChar = " + lasChar);
        String str="wooden spoon";
        str=str.toUpperCase();//"WOODEN SPOON"
    }
}
