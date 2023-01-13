package Day17_WhileAndDoWhile;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if(i%2!=0){//1,3,5,7,9
                continue;//Skip
            }
            System.out.println(i);
        }
    }
}
