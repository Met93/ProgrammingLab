package Day37_Inheritance_Continue_SuperKeyword.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("Alex","Husky",'M',2,"Big","White");
        System.out.println(dog1);
        dog1.bark();
        Cat cat1=new Cat("Love","Siamese",'F',2,"Large","Grey");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1=new Parrot("King","Macaw",'M',3,"Small","Blue");
        System.out.println(parrot1);
        parrot1.sing();

    }

}
