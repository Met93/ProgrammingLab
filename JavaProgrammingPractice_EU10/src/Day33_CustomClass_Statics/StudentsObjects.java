package Day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1=new Student("Metin");
        Student student2=new Student("Metin",'M');
        Student student3=new Student("Metin",23948345);
        Student student4=new Student("Metin",'M','B',23,59406904);
        Student student5=new Student("Metin",11);
        System.out.println(student5);
        System.out.println(student1==student2);
        Student[]students={student1,student2,student3,student4,student5};
        System.out.println(Arrays.toString(students));
    }
}
