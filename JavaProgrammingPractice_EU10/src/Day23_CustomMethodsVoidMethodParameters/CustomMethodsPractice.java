package Day23_CustomMethodsVoidMethodParameters;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        //create a function that can print hello world 5 times==>hellowWorld5Time
        hellowWorld5Times();
        System.out.println("-----------------------------------");

        helloCydeo5Times();
        System.out.println("---------------------------------------");
        evenNumbers();


    }
    //create a funtion that can print hello Cydeo 5 times=>helloCydeo5Times
    public static void hellowWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
    }
    //create a function that can print all the even numbers from 1-10==>evenNumbers
    public static void evenNumbers(){
        for (int i = 0; i < 11; i+=2) {
            System.out.println(i);
        }

    }
}
