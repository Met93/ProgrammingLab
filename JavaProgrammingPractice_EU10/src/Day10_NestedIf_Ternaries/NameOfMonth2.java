package Day10_NestedIf_Ternaries;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int n=5;
        String result=(n==1)?"Jan":(n==2)?"Feb":(n==3)?"March":(n==4)?"April":"Other Months are not important";
        System.out.println(result);

    }
}
