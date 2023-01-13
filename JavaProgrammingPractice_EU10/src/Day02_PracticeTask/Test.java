package Day02_PracticeTask;

import Day24_CustomMethodsReturnMethod.ReturnMethodIntro;
import Day24_CustomMethodsReturnMethod.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {
       String str="aaaaaaaaaaabbbbbbbbbbbbbbbbb";
        str=ReturnMethodPractice4.removeDublicates(str);
        System.out.println(str);
        String name="Java Programming";
        name= ReturnMethodIntro.reversed(name);
        System.out.println(name);

    }
}
