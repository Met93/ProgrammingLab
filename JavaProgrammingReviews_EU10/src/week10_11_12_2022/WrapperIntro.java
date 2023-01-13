package week10_11_12_2022;

public class WrapperIntro {
    public static void main(String[] args) {
        //int double boolean char
        int a=2;
        Integer b=122;
        Integer c=new Integer(122);
        String number1="123";
        String number2="200";
        String result=number1+number2;
        System.out.println(result);
        int result1=Integer.parseInt(number1);
        int result2=Integer.parseInt(number2);
        System.out.println(result1+result2);
        //what is the difference between parseInt() and valueof()
        //valueOf() returns an Object(Wrapper class)
        //parseInt returns primitive data type
        int i = Integer.parseInt("123");
        Integer integer = Integer.valueOf("123");
        //what is the difference between autoboxing and unboxing
        //autoboxing primitive to object(wrapper class)
        //unboxing object(wrapper)to primitive
        int i1=12;
        Integer integer1=i1;//autoboxing primitive to object


    }
}
