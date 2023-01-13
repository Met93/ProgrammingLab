package week09_11_5_2022;

public class Task3 {
    public static void main(String[] args) {
        armStronNumber(153);
    }

    public static void armStronNumber(int i) {
        int lastDigit=i%10;
        int secondDigit=(i%100-lastDigit)/10;
        int firstDigit=(i%1000-secondDigit-lastDigit)/100;

        int a=firstDigit*firstDigit*firstDigit+secondDigit*secondDigit*secondDigit+lastDigit*lastDigit*lastDigit;
        if(i==a){
            System.out.println("Armstron number");
        }
        else {
            System.out.println("You dont even change");
        }
    }
}
