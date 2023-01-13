package Day14_String;

import java.util.Locale;

public class StringsMethodsLast {
    public static void main(String[] args) {
        String str="";
        boolean a=str.isEmpty();
        System.out.println(a);
        boolean b=str.isBlank();
        System.out.println(b);
        String str2="Cydeo    ";
        System.out.println(str.isBlank());
        System.out.println("---------------------------");
        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String sentence="My favorite programming language is Java";
        boolean c=sentence.contains("Java");
        System.out.println(c);
        boolean d=sentence.contains("java");
        System.out.println(c);
        boolean f=sentence.toLowerCase().contains("java");//ignore case sensivity the way that to find it.
        System.out.println(f);
        boolean g=sentence.contains("java")||sentence.contains("Java");
        System.out.println(g);
        String o="Wooden Spoon";
        boolean p=o.startsWith("Woo");
        boolean y=o.endsWith("Spoon");
        boolean z=o.toLowerCase().startsWith("wooden");//in order to ignore the case sensivitiy we first create the lower case/upper case of version string


    }
}
