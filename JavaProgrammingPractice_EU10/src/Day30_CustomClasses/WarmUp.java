package Day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
        System.out.println("--------------------------------");
        ArrayList<Integer>numbers1=new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(numbers1);
        int size=numbers1.size();
        numbers1.removeAll(Arrays.asList(0));
        System.out.println(numbers1);
        int newSize=numbers1.size();
        int totalNumbersOf0=size-newSize;
        System.out.println(totalNumbersOf0);
        for (int i = 0; i < totalNumbersOf0; i++) {
            numbers1.add(0);
        }
        System.out.println(numbers1);


        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer>result=new ArrayList<>();
        for (Integer each : list) {
            if(each!=0){
                result.add(each);
            }
        }
        for (Integer each : list) {
            if(each==0){
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("-------------------------------------");


        String str="ABCD123$%#&456EFG!";
        ArrayList<Character>list1=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list1.add(str.charAt(i));
        }
        ArrayList<Character>letter=new ArrayList<>(list1);
        letter.removeIf(p->!Character.isLetter(p));//remove the cahracters that are not letters
        System.out.println(letter);

        ArrayList<Character>digits=new ArrayList<>(list1);//add all the characters
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println(digits);
        ArrayList<Character>SpecialChar=new ArrayList<>(list1);
        SpecialChar.removeAll(letter);
        SpecialChar.removeAll(digits);
        System.out.println(SpecialChar);


    }
}
