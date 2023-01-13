package week08_10_29_2022;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        //if we know the elements of the array
        int []arr={1,2,3,4,5,6};
        //if we dont know the elements
        //use new keyword
        int[]arry=new int[5];
        arry[0]=1;
        arry[1]=2;
        arry[2]=3;
        arry[3]=4;
        arry[4]=5;
        //print the elements
        System.out.println(Arrays.toString(arry));
        System.out.println(arry[1]);
        System.out.println("-----------------");
        int []arr1={1,2,3};
        int[]arr2={2,1,3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("------------------");
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));


        boolean[]array=new boolean[3];
        double []doubles=new double[2];
        doubles[1]=10;
        //sort method is sorting elements to smallar to bigger
        int []number={2,5,3,4,1};
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));


    }
}
