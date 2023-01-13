package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReversedSecondwordInterviewQuestion {
    public static void main(String[] args) {
        String sentence="I Love Java";
        String []words=sentence.split(" ");
        String reverse="";
        for (int i=words[1].length()-1;i>=0;i--){
        reverse+=words[1].charAt(i);
        }
        System.out.println(reverse);
        // one technic sentence=sentence.replaceFirst(words[1],reverse);
        words[1]=reverse;
        System.out.println(Arrays.toString(words));
        String result="";
        for (String word : words) {
            System.out.println(word+" ");
            result+=word+" ";
        }
        System.out.println(result);
    }
}
