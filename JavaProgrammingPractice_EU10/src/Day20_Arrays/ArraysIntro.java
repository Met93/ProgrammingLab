package Day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names.
        String myGroup[]=new String[5];
        myGroup[0]="Günay";
        myGroup[1]="Metin";
        myGroup[2]="Ali";
        myGroup[3]="Reis";
        myGroup[4]="Umuş";
        //String[]myGroup
        System.out.println(myGroup);//hashCdoe
        System.out.println(Arrays.toString(myGroup));
        String []days={"Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));
        int number=5;
        System.out.println(days[number-1]);
    }
}
