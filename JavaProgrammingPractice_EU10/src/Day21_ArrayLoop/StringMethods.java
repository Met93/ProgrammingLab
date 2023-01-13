package Day21_ArrayLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[]chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (char each:str.toCharArray()/*chars*/ ){
            System.out.println(each);
        }
    }
}
