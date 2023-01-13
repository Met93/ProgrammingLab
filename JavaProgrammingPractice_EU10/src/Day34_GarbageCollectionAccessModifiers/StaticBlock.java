package Day34_GarbageCollectionAccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");

    }//in Java instead of running the first main method static method will be executed, although code will be executed top to bottom.If you have static block

    static{//runs first before anything, amd only runs one time
        System.out.println("Static Block");

    }//static blocks it can be runned more than once
    static{//runs first before anything, amd only runs one time
        System.out.println("Static Block2");
//one static block will be enough for initializing all the static members
    }
    static{//runs first before anything, amd only runs one time
        System.out.println("Static Block3");

    }


}
