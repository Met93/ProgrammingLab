package Day13_String;

public class StringInfo {
    public static void main(String[] args) {
        // Index Number: stars from zero
        //"Cydeo"
        // 01234 String is immutable it can not be modified.
        //Java Heap is the memory of location all the objects that you creating will be in java Heap.
        //Inside the heap there is String pool(String literal stored in here
        // if the created object has more than one character similarity with others the created Object same in String Pool(String pool it can not take dublicates.

        String str="Java";
        String str1="Java";
        String name="Wooden Spoon";
        String name1="Wooden Spoon";
        String name2="Wooden Spoon";
        String name3="Wooden Spoon";
        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        String str2=new String("Java");
        String str3=new String("Java");
        System.out.println(str2 == str3);
        System.out.println("---------------------------");
        String s1="Java";
        String s2=new String("Java");
        System.out.println(s1.equals(s2));
        String s3="Java";
        String s4=new String("java");
        System.out.println(s3.equals(s4));//false comparing values of two objects if they have same sequence of character then it will turn true
        //String str=   "Java !";
        // index number= 012345
        //String Methods:
        //charAt(index): returns the character at the given index, returns char

    }
}
