package Day24_CustomMethodsReturnMethod;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfMonth(-5);
    }
    public static void nameOfMonth(int number){
        if(number<1||number>12){
            System.out.println("Invalid");
            return;//exits nameOfMonth
        }
        String name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"Apr":(number==5)?"May":(number==6)?"Jun":(number==7)?"July":(number==8)?"Augst":(number==9)?"September":(number==10)?"Oct":(number==11)?"Nov":"Dec";
        System.out.println(name);
    }
}
