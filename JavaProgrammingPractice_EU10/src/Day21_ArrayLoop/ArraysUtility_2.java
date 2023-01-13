package Day21_ArrayLoop;

import java.util.Arrays;

public class ArraysUtility_2 {
    public static void main(String[] args) {
        String[]students={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[]earlyBirds= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));
        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);//starting from first element ALWAYS
        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------------------------------------------");
        char[]ch1={'A','B','C','D','F','G','H','I'};
        char[]ch2=Arrays.copyOfRange(ch1,3,6);//Similar to substring method
        System.out.println(Arrays.toString(ch2));
        char[]ch3=Arrays.copyOfRange(ch1,3,6+1);
        System.out.println(Arrays.toString(ch3));
        int[]scores={10,20,30,40,50,60,70,80,90,100};
        //indexn      0  1  2  3  4  5  6  7  8  9
        int[]scores2=Arrays.copyOfRange(scores,3,8);
        //copyOfRane(array,beginningIndex,endingIndex)
        System.out.println(Arrays.toString(scores2));
        int[]result2=Arrays.copyOfRange(scores,3,10);
        System.out.println(Arrays.toString(result2));


    }
}
