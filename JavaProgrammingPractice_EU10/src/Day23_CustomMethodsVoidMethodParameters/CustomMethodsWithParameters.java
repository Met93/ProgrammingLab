package Day23_CustomMethodsVoidMethodParameters;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        //create a function that can check if a number is odd number of even number
        oddOrEven(10);// the method demands additional info to complete its task
        ageOfPerson(1995);
        printNumbers(1000,2000);

        }
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");

        }
    }
    public static void ageOfPerson(int brithYear){
        int age=2021-brithYear;
        System.out.println("Your age is: "+age);
    }
    public static void printNumbers(int x,int y){

    }
}
