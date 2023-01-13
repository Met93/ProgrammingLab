package Day29_ArrayListContinueAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[]countries={"Turkey","Japan","USA","United Kingdom","Korea","Canada"};
        // convert array to arrayList:
        ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p->p.length()>=10);
        //converting arrayList to array
        countries=list.toArray(new String[0]);//it will be going to replace with length of list(String [0])
        System.out.println(Arrays.toString(countries));
    }
}
