package Day25_CustomMethodMethodOverloadingRecaps;

import java.util.Arrays;

public class OverLoadingIntro {
    public static void main(String[] args) {
        int []intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);
        double[]doubleArray={10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);
        char[]charArray={'M','e','t','i','n'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("-------------------------------------");
        sumOfNumbers(10,20,30,40);
    }
    public static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }
    public static int sumOfNumbers(int num1,int num2,int num3){
        return num1+num2+num3;
        //return sumOfNumber(num1,num2)+num3
    }
    public static int sumOfNumbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
        //return sumOfNumbers(num1,num2,num3)+num4
    }
}
