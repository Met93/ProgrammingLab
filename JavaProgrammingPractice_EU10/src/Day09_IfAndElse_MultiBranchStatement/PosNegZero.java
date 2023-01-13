package Day09_IfAndElse_MultiBranchStatement;

public class PosNegZero {
    public static void main(String[] args) {
        int n=100;
        if(n>0){
            System.out.println("Positive");
        }
        if(n==0){
            System.out.println("Zero");
        }
        if(n<0){
            System.out.println("Negative");
        }
        boolean positive=n>0;
        boolean negative=!positive;
        if(positive){
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
