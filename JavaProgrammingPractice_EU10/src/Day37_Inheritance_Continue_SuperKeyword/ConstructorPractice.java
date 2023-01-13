package Day37_Inheritance_Continue_SuperKeyword;

class A{
    /*public A(){// it gives the parent constructor automaticly if construtor cant have any argument
        System.out.println("A");
    }

     */
    public A(int a){//if constructor have any parameter you have to create manually by yourself a constructor for the subclass or child class
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super(9);
        //super() compiler give the automaticly parent constructor
        System.out.println("B");
    }

}


public class ConstructorPractice {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj);
    }
}
