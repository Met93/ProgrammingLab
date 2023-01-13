package Day37_Inheritance_Continue_SuperKeyword.AnimalTask;

public class Parrot extends Animal {
    public Parrot(String name, String breed, char gender, int age, String size, String color) {//,String parrotWingColor
        super(name, breed, gender, age, size, color);
        //this.parrotWingColor=parrotWingColor;
    }
    public String parrotWingColor;
    public void sing(){
        System.out.println(name+" is singing");
    }
}
