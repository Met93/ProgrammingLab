package Day27_WrapperClasses;

public class WrappedClassMethods {
    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str);
        System.out.println(num+1);
        System.out.println(str+1);
        String str2="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2+1);
        int maxValue=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("maxValue = " + maxValue);
        String s1="true";
        boolean a=Boolean.parseBoolean(s1);
        System.out.println(a);
        System.out.println("----------------");
        String s2="123";
        Integer b=Integer.valueOf(s2);
        int y=Integer.valueOf(s2);//unboxing
        System.out.println(y);
        //isDigit()
        char ch1='0';
        boolean c=Character.isDigit(ch1);
        System.out.println(c);


    }
}
