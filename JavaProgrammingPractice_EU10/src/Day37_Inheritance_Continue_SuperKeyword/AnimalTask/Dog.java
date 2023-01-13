package Day37_Inheritance_Continue_SuperKeyword.AnimalTask;

public class Dog extends Animal{
              //"Max" name will be instance variable
    //if you want to add any other instance For example public int a;
  public Dog(String name, String breed, char gender, int age, String size, String color){
      super(name, breed,gender,age,size,color);//construcotr
      //this.a=a;

  }
  public void bark(){
      System.out.println(name+" is barking");
  }
}

