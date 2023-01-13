package Day29_ArrayListContinueAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        int[]result=new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("----------------------------------");

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer> reversedList=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            int ach= list.get(i);
            reversedList.add(ach);
        }
        System.out.println(reversedList);
    }
}
