package Day10_NestedIf_Ternaries;

public class NameOfDay {
    public static void main(String[] args) {
        int number=5;
        String result=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        System.out.println(result);
    }
}
