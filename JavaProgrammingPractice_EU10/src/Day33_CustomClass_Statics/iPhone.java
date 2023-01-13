package Day33_CustomClass_Statics;

public class iPhone {
    public static String brand="Apple";
    public String model;
    public double Price;
    public static String operatingSystem="IOS";
    public String colors;
    public String size;
    public static String madeIn="China";//static method accept just statics
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;
    //public static void printModelAndPrice(){
     //   System.out.println(model+" : "+price);//static methods does not accept instances
   //}
    //public static void printOperatingSystem{
       // System.out.println(operatingSystem);
   // }
    public void method1(){//Advantage:One object will be shared all the objects 2)
        //System.out.println(model+" : "+price);
        System.out.println(operatingSystem);
        //this.age=LocalDate.now().getYear()-dateOfBirth.getYear();
    }

}
