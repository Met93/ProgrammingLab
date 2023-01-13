package Day34_GarbageCollectionAccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //But private classes can not be used out of the class even if this class is located in same package
        //private is not visible out of the classes
        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3(); private access modifiers can not be used out of the class
    }
}
