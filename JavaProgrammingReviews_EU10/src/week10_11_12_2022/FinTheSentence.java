package week10_11_12_2022;

public class FinTheSentence {
    public static void main(String[] args) {
        /*
         Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java

         */
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getSentence(str);

    }

    public static void getSentence(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')){//Character.isLeeter(ch)
                result+=ch;
            }
            //if we are talking english letters we can use isAlphabetic()
            //if we are talkşng other letters we can use isLetter()
            if(Character.isAlphabetic(ch)){
                result+=ch;
            }

        }
        System.out.println(result);
    }
}
