package Day18_NestedLoop;

public class TriAngle {
    public static void main(String[] args) {
        /*
        Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
         */
        int rows=10;
        for(int j=0;j<rows;j++){
            for (int i = 0; i <j;i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
