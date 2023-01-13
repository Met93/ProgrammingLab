package Day34_GarbageCollectionAccessModifiers;
import static Day34_GarbageCollectionAccessModifiers.Circle.pi;//
public class StaticImport {
    public static void main(String[] args) {
        //static import: import static packageName.className.staticMember; it just imports one static member
        //import static packageName.clasName.*;it imports all the static members
        System.out.println(pi);

    }
}
