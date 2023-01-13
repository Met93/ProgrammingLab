package Day34_GarbageCollectionAccessModifiers;

public class AccessModifiers {
    //Access Modifiers: define the accessibility
    //private: ONLY reachable within class
    //default(no modifier):Only reachable within the same package
    //public:ALWAYS reachable
    public static int publicData=100;
    static int defaultData=200;//access modifier:default
    private static int privateData=300;
    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("default");
    }
    private static void method3(){
        System.out.println("Private");
    }

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
}
