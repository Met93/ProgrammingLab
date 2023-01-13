package Day34_GarbageCollectionAccessModifiers;

public class StaticMembers {//outer class, outer class cant have any static members
    static class class1{//inner class ,class can be only static if the inner class contains static word

    }
    public static int num=100;
    public static void method(){

    }
    static{//in order to create (pre-Condition it has)static class you have to use nested classes

    }

}
/*
static class A{ it cant be static class while it should be nested class

}

 */
class A{// outer class cant be static while it should be nested class
    static class B{//the reason is that static class should be member of class
        public static void method1(){

        }

    }
}
class C{// it calls nested classes
    public static void main(String[] args) {
        A.B.method1();
    }
}
class X{

}
class V{

}
class Z{
    class Q{//only the inner class can be static

    }
}