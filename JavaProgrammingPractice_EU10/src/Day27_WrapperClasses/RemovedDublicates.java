package Day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemovedDublicates {
    public static void main(String[] args) {
        int[]arr={1,1,1,2,2,2,2,3,3,3,4,4,4,4};
        arr=removedDublicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------");
        String[]word={"Java","Java","Python","C#","Java","Java"};
        word=removedDublicates(word);
        System.out.println(Arrays.toString(word));
        int[]numbers={1,1,1,1,1,1,2,2,2,22,2,3,3,3,3,54,5,5,5,5};
        numbers=Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(numbers));
    }
    //will be removed from the given array,if it contains dublicates
    public static int[]removedDublicates(int[]array){
       int[]result={};
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //will be removed from the given array,if it contains dublicates
    public static double[]removedDublicates(double[]array){
        double[]result={};
        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //will be removed from the given array,if it contains dublicates
    public static char[]removedDublicates(char[]array){
        char[]result={};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    //will be removed from the given array,if it contains dublicates
    public static String[]removedDublicates(String[]array){
        String[]result={};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
