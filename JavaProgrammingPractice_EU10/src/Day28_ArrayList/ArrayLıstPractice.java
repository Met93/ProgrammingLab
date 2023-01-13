package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLıstPractice {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {//i:index numbers of list
            numbers.set(i,numbers.get(i)*2);
        }
        System.out.println(numbers);
        System.out.println("----------------------------");

        ArrayList<String>employees=new ArrayList<>();
        employees.add("Metin");
        employees.add("Umut");
        employees.add("Ali");
        employees.add("Hatice");
        employees.add("Reis");
        employees.add("Halil");
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("Ali");
        System.out.println(employees);







    }
}
