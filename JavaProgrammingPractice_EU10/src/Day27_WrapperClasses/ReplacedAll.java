package Day27_WrapperClasses;

import java.util.Arrays;

public class ReplacedAll {
    public static void main(String[] args) {
        int []array={10,10,20,30,40,30,30};
        array=replaceAll(array,30,100);
        System.out.println(Arrays.toString(array));
    }
    //replaces all the matching old values of the array with the new value
    public static int[]replaceAll(int[]array,int oldValue,int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    //replaces all the matching old values of the array with the new value
    public static char[]replaceAll(char[]array,char oldValue,char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
    //replaces all the matching old values of the array with the new value
    public static String[]replaceAll(String[]array,String oldValue,String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
}
