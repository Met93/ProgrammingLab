package Day24_CustomMethodsReturnMethod;

public class BreakfastTask {
    public static void main(String[] args) {
        initials("Metin","Acir");
        domain("Cydeo.School@gmail.com");
        String[]emails={"josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","Gulsen@gmail.com"};
        for (String each : emails) {
            domain(each);
        }
        nameOfMonth(13);
        nameOfDay(5);
        daysInMonth(4);

    }
    public static void initials(String firstName,String Lastname){
        String initial=firstName.charAt(0)+"."+Lastname.charAt(0);
        System.out.println(initial);
    }
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }
    public static void nameOfMonth(int number){
        String name="";
        if(number>=1&&number<=12){
           name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"Apr":(number==5)?"May":(number==6)?"Jun":(number==7)?"July":(number==8)?"Augst":(number==9)?"September":(number==10)?"Oct":(number==11)?"Nov":"Dec";
        }else{
            name="Invalid";
        }
        System.out.println(name);
    }
    public static void nameOfDay(int number){
        String nameOfDay="";
        if(number>=1&&number<=7){
        nameOfDay=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        }else{
            nameOfDay="Invalid";
        }
        System.out.println(nameOfDay);

    }
    public static void daysInMonth(int number){
        String result=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"April":"Other Months are not important";
        System.out.println(result);

    }
}
