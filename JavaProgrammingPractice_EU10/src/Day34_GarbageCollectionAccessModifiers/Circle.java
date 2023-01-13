package Day34_GarbageCollectionAccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;//=3.14;
    public static String name;//"Circle";
    public static ArrayList<Integer>numbers;

    public Circle(double radius){//Constructor should be named with class name
        this.radius=radius;
        //pi=3.14;//if you use static variable in constructor it will be caused to more data.OTherwise it will be executed several times
        //you shouldnt set any static member in constructor because of the Informations that are already explained in Top
    }
    static {
        //radius=5; static expect just a static varible
        pi=3.14;
        name="Circle";

        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }



}
