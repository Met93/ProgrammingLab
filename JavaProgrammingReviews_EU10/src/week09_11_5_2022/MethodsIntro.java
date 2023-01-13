package week09_11_5_2022;

public class MethodsIntro {
    public static void main(String[] args) {
        //printHello5times
       printHeelo5times();
        //we want to add two number

        int result=sum(5,6);
        multiplywith2AndPrint(result);
        System.out.println(sum(20, 30));
    }
    public static void printHeelo5times(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static int sum(int num1, int num2) {
        return num2+num1;
    }
    //multipy that number
    public static void multiplywith2AndPrint(int result) {
        System.out.println(result*2);

    }


}

