package Day34_GarbageCollectionAccessModifiers;


import Day30_CustomClasses.Dog;
import Day31_CustomClassConstructors.Student;
import Day32_CustomClass_Constructors.Car;
import Day33_CustomClass_Statics.iPhone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        //in order to use Garbage collection there is two way the created Object can be
        // unreferenced by nulling reference and by assigning a reference to another
        //null key words can be used just for primitive data type
        String str="Wooden Spoon";//it is not eligible for garbage collection
        Car car1=new Car("Toyota");
        car1=null;
        System.out.println(car1);
        System.out.println("-------------------------");
        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1=new Dog();//this dog cant have any reference that is why is not eligible for garbage collection
        dog1.name="Max";
        System.out.println(dog1);
        String language="Python";
        language="Java";
        System.out.println(language);
        System.out.println("---------------------------");
        ArrayList<Integer>list1=new ArrayList<>();//one objects has been created
        list1.add(100);
        ArrayList<Integer>list2=list1;//one object has two referrence name
        list2.addAll(Arrays.asList(100,200,300));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);
        System.out.println("---------------------------------");
        Student student1=new Student("Tahir",30,'M','B',14);
        student1.grade='A';
        Student student2=student1;
        student2.name="Ahmet";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("------------------------------");
        ArrayList<String>l1=new ArrayList<>();
        l1.add("Java");
        ArrayList<String>l2=new ArrayList<>();
        l2.add("Python");
        System.out.println("l2 = " + l2);
        System.out.println("l1 = " + l1);
        //one reference name it can be only one object
        //garbage collection=unreferenced objects it is only for primitives group of garbage collection objects
        //Garbage collector: responsible for collecting the unreferenced objects from java heap. and destroys it(finalize())





    }
}
