package week08_10_29_2022;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[]number={1,2,3,4,5};
        for(int each:number){
            System.out.println(each);
        }
        //toCharArray()
        String str="Adam";
        char[]letters=str.toCharArray();
        System.out.println(Arrays.toString(letters));
        for (char each : letters) {
            System.out.println(each);
        }
        //split(regex)
        String sentence="Java is a good language";
        String[]word=sentence.split(" ");
        System.out.println(Arrays.toString(word));
        for (String each : word) {
            System.out.println(each.replace(",",""));
        }
    }
}
