package Day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1=200;
        Integer n1=num1;//AUTO BOXING
        int num2=n1;//unboxing
        Integer integerValue=100;
        long longValue=integerValue;
        System.out.println("------------------------");
        int num3=200;
        Integer num4=num3;
        Byte b1=25;
        byte a1=b1;
        short a2=b1;
        int a3=b1;
        long a4=b1;
        System.out.println("------------------------");
        Integer z=900;
        Integer a=z;

    }
}
