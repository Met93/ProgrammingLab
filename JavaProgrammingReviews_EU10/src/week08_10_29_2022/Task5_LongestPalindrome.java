package week08_10_29_2022;

public class Task5_LongestPalindrome {
    public static void main(String[] args) {
        String[]names={"java","longer word","civciv","apple","racecar","mom","anna"};
        // we need to get word one by one
        String longestPalindrome="";
        for (String each : names) {
            boolean isPalindrome=true;
            for (int i = 0; i <each.length()/2; i++) {
                char ch1=each.charAt(i);
                char ch2=each.charAt(each.length()-i-1);
                if(ch1!=ch2){
                    isPalindrome=false;
                    break;
                }
                if(isPalindrome&&each.length()>longestPalindrome.length()){
                    longestPalindrome=each;
                }

            }
            System.out.println(longestPalindrome);
        }


    }
}
