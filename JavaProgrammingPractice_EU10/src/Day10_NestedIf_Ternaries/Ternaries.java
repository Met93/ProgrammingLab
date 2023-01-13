package Day10_NestedIf_Ternaries;

public class Ternaries {
    public static void main(String[] args) {
        int n=100;
        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println("--------------");
        String result=(n%2==0)?"Even":"Odd";
        System.out.println("-----------");
        int number=2;
        String result3=(number==1)?"January":(number==2)?"February":"Invalid";
        int age=23;
        String result2=(age>=21)?"Eligible":"Not eligible";
        System.out.println(result2);
    }
}
