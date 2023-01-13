package Day31_CustomClassConstructors;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1=new Person("Daniel",'M',32);
        Person person2=new Person("Metin",'M',29);
        Person person3=new Person("Hosni",'F',22);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        person3.age=30;
        System.out.println(person3);
    }
}
