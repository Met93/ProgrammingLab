package week09_11_5_2022;

public class Task5_DifferenceWith21 {
    public static void main(String[] args) {
        int result= diff21(19);
        System.out.println(result);
    }

    public static int diff21(int number) {
       return  (number<21)?21-number:(number-21)*2;
    }
}
