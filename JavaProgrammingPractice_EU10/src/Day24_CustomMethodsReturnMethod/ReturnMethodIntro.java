package Day24_CustomMethodsReturnMethod;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str="Java";
        String result=reversed(str);
        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println("str is palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
    public static String reversed(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
