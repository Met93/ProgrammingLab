package Day34_GarbageCollectionAccessModifiers;

public class Constructor_Vs_StatickBlock {
    static{
        System.out.println("Static Block");
    }
    public Constructor_Vs_StatickBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Constructor_Vs_StatickBlock();
        new Constructor_Vs_StatickBlock();
        new Constructor_Vs_StatickBlock();
        new Constructor_Vs_StatickBlock();
        new Constructor_Vs_StatickBlock();
    }
}
