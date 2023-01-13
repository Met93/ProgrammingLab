package Day06_PrimitiveTypeCastingsArithmeticOperators;

public class BirthDay {
    public static void main(String[] args) {
        String name="John",
                birthMonth="April";
        int birthDay=25,
                birthYear=1995;
        System.out.println(name+" was born on "+birthDay+"/"+birthMonth+"/"+birthYear+".");
        String bookName="The Rich Dad and The Poor Dad";
        System.out.println("My favorite book is " + "\""+bookName+ "\"");
        int number;
        double dval=32.33;
        number=(int)dval;
        System.out.println(number);
    }
}
