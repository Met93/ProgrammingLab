package Day26_CustomMethodsPractices;

import java.util.Arrays;

public class ReversedArrays {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int[]result=reversed(arr);
        System.out.println(Arrays.toString(arr));
    }
    // reverses the given array, returns a new array
    public static int[]reversed(int[]array){
        int[]result=new int [array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }
    // reverses the given array, returns a new array
    public static double[]reversed(double[]array){
        double[]result=new double [array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }
    // reverses the given array, returns a new array
    public static char[]reversed(char[]array){
        char[]result=new char [array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }
    // reverses the given array, returns a new array
    public static String[]reversed(String[]array){
        String[]result=new String [array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

}
