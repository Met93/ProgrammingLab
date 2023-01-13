package Day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email="Cydeo.School@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);
        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.lastIndexOf(".");
        String email2=email.substring(beginningIndex,endingIndex);
        System.out.println(email2);
        String str1="Java is fun, Java is cool";
        String s1=str1.substring(0,10+1);
        System.out.println(s1);
        int beg=str1.lastIndexOf("J");
        int end=str1.lastIndexOf(",");
        String s2=str1.substring(beg,end);
        String s3=str1.substring(str1.lastIndexOf("I"));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String str="Cydeo";
        str=str.repeat(4);
        System.out.println(str);
        String s5="Wooden Spoon";
        String s6=s5.repeat(100);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("----------------------------------");
        System.out.println("FADY\n".repeat(15));

    }
}

