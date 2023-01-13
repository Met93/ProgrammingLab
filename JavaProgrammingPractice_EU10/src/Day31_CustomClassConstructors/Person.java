package Day31_CustomClassConstructors;

public class Person {
    public String name;
    public char gender;
    public int age;
    public Person (String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;//instead of set of methods should be used constructor for creating
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
