package Day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a=10,
                b=15,
                c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        int year=2000;
        boolean isLeapyearYear= year%4==0;
        System.out.println("isLeapyearYear = " + isLeapyearYear);

    }
}
