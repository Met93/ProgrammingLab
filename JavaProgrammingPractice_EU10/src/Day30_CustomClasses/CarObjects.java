package Day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
       /* Car car1=new Car();
        car1.setInfo("Ecoupe","Mercedes","Blue",2021,35000);
        System.out.println(car1);
        Car car2=new Car();
        car2.setInfo("X5","BMW","Black",2023,55000);
        System.out.println(car2);
        Car car3=new Car();
        car3.setInfo("A6","Audi","Red",2022,65000);
        System.out.println(car3);

        //Car[]cars={car1,car2,car3};
        ArrayList<Car>cars=new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3));
        for(Car each:cars){
            System.out.println(each.brand+ " : "+each.price);
        }
        System.out.println("--------------------------------------");
        cars.removeIf(p-> p.brand.equals("BMW")&&p.year<=2008&&p.year>=2005);
        cars.removeIf(p-> p.brand.equals("Mercedes")&&p.year<=1997&&p.year>=2005);
        /*
        BMW:2005-2008
        Toyota:1995-1997

         */

    }
}
