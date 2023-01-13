package Day21_ArrayLoop;

import java.util.Arrays;

public class Arraysutility {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5};
        System.out.println(num);//hashcode
        //Utility class is array
        System.out.println(Arrays.toString(num));//"{1,2,3,4,5}"
        //toString():convert the object to string
        System.out.println("---------------------------------------------");
        //sort():sorts the array in ascending order 0-9
        int[]scores={95,100,55,65,85,70};
        Arrays.sort(scores);//{55....100}
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: "+scores[0]);
        System.out.println("Max score: "+scores[scores.length-1]);
        String []names={"Anna","Ahmet","Günay","Zuhal","Maria","Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        String[]words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//asci table order uppercase letter is smaller than lowercase
        //equals(array1,arrays2);
        System.out.println("--------------------------------------");
        int[]arr1={1,3,2};
        int []arr2={1,2,3};
        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);
        System.out.println("-----------------------------------------");
        char []ch1={'a','b','c'};
        char[]ch2={'b','a','c'};
        Arrays.sort(ch1);//a,b,c
        Arrays.sort(ch2);//a,b,c
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println(anagram);
        //equals(arrays1,arrays2):check if two arrays are equal,returns boolean
        //copyOf(array,newLenght)

    }
}
