package Day26_CustomMethodsPractices;

import Utilities.ArraysUtility;

public class ReversedArray2 {
    public static int[]reverse(int[]array){
        int [ ]result={};
        for (int i = array.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }
}
