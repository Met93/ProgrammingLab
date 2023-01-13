package Day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setInfo("Metin",179643,'M',29,'A');
        Student student2=new Student();
        student2.setInfo("Umut",789623,'M',26,'B');
        Student student3=new Student();
        student3.setInfo("Hatice",2357483,'F',25,'C');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        ArrayList<Student> studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));
        Student[]students={student1,student2,student3};
        for (Student each : studentList) {
            System.out.println(each.ID+" "+each.grade);
        }
        System.out.println("---------------------------------------");
        ArrayList<Student>earlyBirds=new ArrayList<>();
        ArrayList<Student>angryBirds=new ArrayList<>();
        for (Student each : students) {
            if(each.grade=='A'){
                earlyBirds.add(each);
            }else{
                angryBirds.add(each);
            }
        }
        System.out.println(earlyBirds);
        System.out.println("--------------------------");
        System.out.println(angryBirds);

    }
}
