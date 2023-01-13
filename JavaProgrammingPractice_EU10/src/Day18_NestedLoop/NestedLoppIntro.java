package Day18_NestedLoop;

public class NestedLoppIntro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("------------------------");
        for(int j=0;j<4;j++){
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");//20 times will be wooden spoon repeated
                //one iteration of the outer loop,executes inner Loop

            }
        }
    }
}
