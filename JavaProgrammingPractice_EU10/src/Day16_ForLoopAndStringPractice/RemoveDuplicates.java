package Day16_ForLoopAndStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="aabbaacc";
        String result="";
        for (int i = 0; i <=str.length()-1 ; i++) {//i: represents the all the index numbers of str (start from 0
            String ch=""+str.charAt(i);
            if(!result.contains(ch)){
                result+=ch;
            }

        }
        System.out.println(result);
    }
}
