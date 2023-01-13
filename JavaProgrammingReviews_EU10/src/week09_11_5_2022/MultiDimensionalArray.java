package week09_11_5_2022;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[]firstArray={1,2,3};
        int[]secondArray={1,2,3};
        int[]ThirdArray={1,2,3};
        int[][]TwoDimensionArray={{1,2,3},{4,5,6},{7,8,9,10}};
        int[][]array2D={firstArray,secondArray,ThirdArray};
        System.out.println(TwoDimensionArray[0][1]);// in order to reacg 2 first we need to go to first array by using
        //index of array whicg is 0 then I need to go to that element by usig index of element which is 1
        System.out.println(TwoDimensionArray[2][2]);
                            // row column number
        for (int i = 0; i < TwoDimensionArray.length; i++) {
            //Arrays.toString(TwoDimensionArray[i]);
            System.out.println(i+1+"."+ " array");
                              //column number
            for (int j = 0; j < TwoDimensionArray[i].length; j++) {//this is for finding elements
                System.out.println(TwoDimensionArray[i][j]);
            }
            System.out.print("============================");
        }

    }
}
