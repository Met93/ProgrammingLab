package Day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str="Java is fun, I love learning Java";
        str=str.replace("Java","Python");
        System.out.println("str = " + str);
        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo","gmail");
        System.out.println("email = " + email);
        String sentence="Java Java Python Python C# C# C++ C++ Python Python Python";
        sentence=sentence.replace("Python","");
        System.out.println("sentence = " + sentence);
        String s="Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog","Cat");
        System.out.println("s = " + s);
        String s2="C# is fun, C# is cool";
        s2=s2.replace("C#","Java");
        System.out.println("s2 = " + s2);
        //replaceFirst() replace with first value that you want to change it
        String result="Java Java Java";
        result=result.replace("Java","Python");
        System.out.println("result = " + result);
        String result2="C# is fun, C# is cool";
        result2=result2.replaceFirst("C#","Java");
        System.out.println(result2);
        String result3="Java";
        result3=result3.replaceFirst("a","vo");
        //substring(beginning index, ending index)
        String word="Cydeo School";
        String brand=word.substring(0,4+1);
        System.out.println("brand = " + brand);
        String str1=word.substring(6);
        System.out.println(str1);
        String word2="Java Programming Language";

        String s1=word2.substring(0,word.indexOf(" "));//"Java"
        String s3=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));//"Programming"
        String s4=word2.substring(word2.lastIndexOf(" ")+1);//"Language"
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);
    }
}
