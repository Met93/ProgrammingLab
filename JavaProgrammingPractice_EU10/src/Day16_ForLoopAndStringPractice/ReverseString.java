package Day16_ForLoopAndStringPractice;

public class ReverseString {
    public static void main(String[] args) {
        String reverse="Wooden Spoon";
        String result="";

        for (int i =reverse.length()-1; i >=0; i--) {//index numbers of reverse (starting last index to 0
            result+=reverse.charAt(i);//adding each charachter ro result
        }
        System.out.println(result);
    }
}
