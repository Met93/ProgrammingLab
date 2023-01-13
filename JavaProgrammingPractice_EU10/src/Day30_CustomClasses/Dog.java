package Day30_CustomClasses;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;
    public void setInfo(String dogName,String dogBreed,int dogAge,char dogGender,String dogSize,String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+ " is barking");
    }//bark method will be instance when we dont make it the other object, that are created will be same
    //customClasses we are creating it for creating the objects
    /*public String toString(){//if you dont give the toString method it will going to give a hashCode

        return "Name: "+name;
    }

     */

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
name:
age:
gender
breed:
size:
color:
Actions:
eat()
play()
bark()

 */
