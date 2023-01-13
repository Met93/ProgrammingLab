package Day29_ArrayListContinueAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Hatice","Metin","Umut","David","Shay"));
        employees.retainAll(Arrays.asList("Metin","David"));
        System.out.println(employees);
        System.out.println("-------------------------------------");
        String []names={"Mary","Monica","Metin","Mehray","Musti","Sumeyra","Beril"};
        ArrayList<String>list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.charAt(0)=='M');
        System.out.println(list);
        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

    }
}
