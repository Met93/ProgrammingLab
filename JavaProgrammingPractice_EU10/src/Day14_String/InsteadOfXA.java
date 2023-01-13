package Day14_String;

import java.util.Scanner;

public class InsteadOfXA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word= input.next();
        if(word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
            System.out.println(word);
        }
    }
}
