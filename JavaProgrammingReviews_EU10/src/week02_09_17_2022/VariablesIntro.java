package week02_09_17_2022;

public class VariablesIntro {
    public static void main(String[] args) {
         byte age=29;
         byte myByte=127;
         short myShort=12;
         long myLong=2897398427384l;
         double myDouble=25.5;
         double myDouble1=25;
         float myFloat=12.5f;
         long l=20;
         int i=(int)l; //we have to say l is integer
        // implicit casting and explicit casting
        //imlicit casting assigning a small data type to gibber
        int a=20;
        long b=20;
        b=a; //implicit casting
        a=(int)b; //explicit casting
        // addition
        /*
        number +number=number
        int=int+int
        double+int=double
        int +short=shrt

        Concatanation
        123+Adam=123Adam;
        12+23+Adam=? 35Adam
         */

        //long data type    int data type
        // explicit casting assigning bigger data type smaller one
    }
    /*
    Variable Types:
    1-Primitive
    -Numerical primitves
    double>float>long>integer>short>byte
     -boolean
     -char define single ''

    2-Non-Primitive( in future we will goon deep
    String define String in "Adam"
    how to declare variables:
    data type variable name=data;
    Variable Naming rules:
    1. MUST be unique (inside the same block)
    2.Lower camelCase
    3.We CAN NOT star with numbers
    4. We CAN NOT use Java Reserved words
    5.For special character_(under score)$(dolar sign)
    6.make it readable and understandable
     */
}
