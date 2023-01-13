package Day34_GarbageCollectionAccessModifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;//you can directly sign it when it is static value
    public CydeoStudent(String studentName){
        this.studentName=studentName;
        //schoolName="Cydeo School";// if you write this static name in constructor it will be executed multiple tim
    }
    static {
        schoolName="Cydeo School";
    }
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Jimmy");
        CydeoStudent student2=new CydeoStudent("Kathy");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }
}
}
