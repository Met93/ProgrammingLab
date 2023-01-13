package Day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.SetInfo("Mahmut","Husky",'M',2,"Small","White");
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();
        System.out.println(dog1);

        Cat cat1=new Cat();
        cat1.SetInfo("Kızıl","British",'M',3,"Small","Red");
        cat1.scratch();
        cat1.meow();
        cat1.eat();
        cat1.sleep();
        cat1.move();
        cat1.drink();
        System.out.println(cat1);
        Tiger tiger1=new Tiger();
        tiger1.SetInfo("Tarçin","Bengal",'M',4,"Large","Orange");
        tiger1.roar();
        tiger1.hunt();
        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
        System.out.println(tiger1);

    }
}
