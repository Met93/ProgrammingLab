package Day18_NestedLoop;

public class NestedLoopRecTangle {
    public static void main(String[] args) {
        /*
        Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         */
        for (int j=0;j<10;j++){
            for (int i = 0; i < 10; i++) {
                System.out.println("* ");
            }
            System.out.println();
            }
    }
}

