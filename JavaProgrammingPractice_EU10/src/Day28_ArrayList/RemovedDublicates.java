package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovedDublicates {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);
        numbers.add(50);
        ArrayList<Integer>result=new ArrayList<>();
        for (Integer each : numbers) {
            if(result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println(result);
        System.out.println("--------------------");
        ArrayList<Integer>num1=new ArrayList<>();
        num1.add(100);
        num1.add(200);
        num1.add(300);
        ArrayList<Integer>num2=new ArrayList<>();
        num2.add(200);
        num2.add(300);
        num2.add(300);
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));
        System.out.println("--------------------------");

        boolean a=num1.isEmpty();
        System.out.println("a = " + a);
        System.out.println("-----------------------");
        ArrayList<Integer>numb=new ArrayList<>();
        //Bulk Operation: CollectionTypes
        numb.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numb);
    }
}
