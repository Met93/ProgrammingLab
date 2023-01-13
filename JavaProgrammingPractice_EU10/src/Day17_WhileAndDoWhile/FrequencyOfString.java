package Day17_WhileAndDoWhile;

public class FrequencyOfString {
    public static void main(String[] args) {
        /*
        write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
         */
        String sentence="JavaJavaJava";
        int frequency=0;
        for (int i = 0; i <=sentence.length()-4; i++) {
            String eachSubstring=sentence.substring(i,i+4);
            if(eachSubstring.equals("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
