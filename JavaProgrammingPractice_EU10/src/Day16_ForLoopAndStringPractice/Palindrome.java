package Day16_ForLoopAndStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        //"Java ==>"avaj"==>false not palindrome
        String word="Level";
        String reversed="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);

    }
}
