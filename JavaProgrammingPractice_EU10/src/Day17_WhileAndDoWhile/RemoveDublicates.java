package Day17_WhileAndDoWhile;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str="AABBCC";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            /*char ch=str.charAt(i);
            if(result.contains(""+ch)) contains can be used only String method
             */
            String ch=""+str.charAt(i);
            if(result.contains(ch)){//if the result already contains the characters
                continue;
            }
            result+=ch;

        }

    }
}
