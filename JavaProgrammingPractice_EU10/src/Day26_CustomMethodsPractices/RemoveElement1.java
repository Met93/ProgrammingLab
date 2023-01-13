package Day26_CustomMethodsPractices;

import java.util.Arrays;

public class RemoveElement1 {
    public static void main(String[] args) {
        int[]array={100,200,300,400,600};
        array=removeElement(array,1);
        System.out.println(Arrays.toString(array));
    }

    //removes the index from the array,returns new array
    public static int[]removeElement(int[]array,int index){
        if(index<0||index>= array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        int[]result=new int[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {//i:array's index number
            if(i==index){// if index of array is matching with the element at the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }
    //removes the index from the array,returns new array
    public static double[]removeElement(double[]array,int index){
        if(index<0||index>= array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        double[]result=new double[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {//i:array's index number
            if(i==index){// if index of array is matching with the element at the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }
    //removes the index from the array,returns new array
    public static char[]removeElement(char[]array,int index){
        if(index<0||index>= array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        char[]result=new char[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {//i:array's index number
            if(i==index){// if index of array is matching with the element at the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }
    //removes the index from the array,returns new array
    public static String[]removeElement(String[]array,int index){
        if(index<0||index>= array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        String[]result=new String[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++) {//i:array's index number
            if(i==index){// if index of array is matching with the element at the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }
}
