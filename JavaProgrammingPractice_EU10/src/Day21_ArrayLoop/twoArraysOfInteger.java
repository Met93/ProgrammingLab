package Day21_ArrayLoop;

import java.util.Arrays;

public class twoArraysOfInteger {
    public static void main(String[] args) {
        String[]arr1={"Ali","Layan","Aysenur"};
        String[]arr2={"Maria","Aygun","Duygu","Suat","Valeriy"};
        String[]arr3=new String[arr1.length+ arr2.length];
        int i=0;
        for (String each : arr1) {
            arr3[i++]=each;
        }
        for (String each : arr2) {
            arr3[i++]=each;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("-----------------");
        char[]ch1={'A','B','C'};
        char []ch2={'D','E','F','G','H'};
        char []ch=new char[ch1.length+ ch2.length];
        int j=0;
        for(char each:ch1){
            ch[j]=each;
            j++;
        }
        for (char each2 : ch2) {
            ch[j]=each2;
            j++;
        }
        System.out.println(Arrays.toString(ch));
    }
}
