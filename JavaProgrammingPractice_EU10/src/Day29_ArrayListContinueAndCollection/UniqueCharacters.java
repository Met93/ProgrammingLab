package Day29_ArrayListContinueAndCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaaabccccdeeef";
        /*
        String str="aaaabccccdeeef";
        String []arr=arr.split("");
         */
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);
        String unique="";
        for (String each : list) {
            int frequnecy=Collections.frequency(list,each);
            if(frequnecy==1){
                unique+=each;
            }
        }
        System.out.println(unique);
    }
}
