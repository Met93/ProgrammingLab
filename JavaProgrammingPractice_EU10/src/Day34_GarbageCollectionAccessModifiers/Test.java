package Day34_GarbageCollectionAccessModifiers;
import static Utilities.MathUtility.sum;
public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);//if you dont use the static import you should write the class name when you want to use any member of static class
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        System.out.println("-----------------------------");
        //find the of 10,20
        //find the sum of 100,200;
        int r1=sum(10,20);
        int r2=sum(100,200);
        System.out.println(r1+" "+r2);


    }
}
