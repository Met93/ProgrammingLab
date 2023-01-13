package Day25_CustomMethodMethodOverloadingRecaps;

import Utilities.ArraysUtility;
import Utilities.StringUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);
        System.out.println("--------------------");
        double []arr2={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);
        char[]arr3={'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);
        int[]n1={1,2,3,4,5,6};
        int max=ArraysUtility.maximumNumber(n1);
        System.out.println(max);
        double[]n2={2.3,4.5,6.6,7.8,20.5};
        //double max2=ArraysUtility.maximumNumber(n2);
        int[]a1={1,2,3,4,5,6,7};
        boolean r1=ArraysUtility.contains(a1,5);
        System.out.println(r1);
        //merger
        //addElements
        //reverse
        //clear
        //frequencyElement
        //UniqueEelement
        //removeDublicates
    }
}
