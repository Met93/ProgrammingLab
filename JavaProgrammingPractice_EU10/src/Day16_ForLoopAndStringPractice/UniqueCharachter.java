package Day16_ForLoopAndStringPractice;

public class UniqueCharachter {
    public static void main(String[] args) {
        //indexof('A')==>0
        //lastIndexOf('A)==>1
        //indexOf('B')==>2
        //lastIndexOf('B')==>2
        String str="aabccc";
        String result="";
        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
