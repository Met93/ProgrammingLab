package Day37_Inheritance_Continue_SuperKeyword.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone1=new Iphone("Iphone 12","6.7 inches",1400,"Black");
        Samsung samsung1=new Samsung("galaxy S19","6 inches",900,"White");
        Nokia nokia=new Nokia("Brick","4 inches",50,"Gray");
        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia);
        iphone1.call(911);
        iphone1.text(405390563);
        iphone1.faceTime(2235956);
        iphone1.faceTime("yahoo@gmail.com");
        System.out.println("----------------------------------");
        samsung1.call(911);
        samsung1.text(349546);
        samsung1.freeze();
        System.out.println("--------------------------------------");
        nokia.call(911);
        nokia.text(349546);
        nokia.selfDefense();
        System.out.println("------------------------");
        System.out.println(iphone1.hasBattery);
        System.out.println(samsung1.hasBattery);
        System.out.println(nokia.hasBattery);

    }


}
