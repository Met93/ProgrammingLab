package week09_11_5_2022;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String result=ourTrim(" Hello ");
        System.out.println(result);
    }

    public static String ourTrim(String str) {
        String dumy="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            //if(ch==' ') interview question that be written like this
            //continue;
            //dumy+=ch;
            if(ch==' '){
                continue;
            }else{
                dumy+=ch;
            }
        }
        return dumy;
    }
}
