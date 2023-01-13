package Day26_CustomMethodsPractices;

import Utilities.ArraysUtility;

public class RemoveElements2 {
    public static  int[]removeElement(int[]array,int index){
        if(index<0||index>= array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        int[]result={};
        for (int i=0;i<array.length;i++) {
            if(i !=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
