package Day31_CustomClassConstructors;

import Day28_ArrayList.ArraysListMethods1;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        ArrayList<PizzaTask>pizzas=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            PizzaTask small=new PizzaTask('S',2,3);
            PizzaTask medium=new PizzaTask('M',3,4);
            PizzaTask large=new PizzaTask('L',4,5);
            pizzas.addAll(Arrays.asList(small,medium,large));
        }
        System.out.println("Total numbe rof pizza: "+pizzas.size());
        double totalPrice=0;
        for (PizzaTask each : pizzas) {
            totalPrice+=each.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
