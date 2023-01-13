package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        /*int num=1;
        list.remove(num);
        System.out.println(list);

         */
        Integer num=200;
        list.remove(num);
        System.out.println(list);
        System.out.println("-----------------------");
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("--------------------------");
        ArrayList<Character>characters=new ArrayList<>();
        characters.add('M');
        characters.add('E');
        characters.add('T');
        characters.add('I');
        characters.add('N');
        int a=characters.indexOf('M');//0
        int c= characters.lastIndexOf('N');//4
        System.out.println(a);
        System.out.println(c);
        System.out.println("-----------------------");
        boolean r1=characters.contains('A');
        boolean r2=characters.contains('Z');
        System.out.println(r1);
        System.out.println("r2 = " + r2);

    }
}
