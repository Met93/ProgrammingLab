package Day29_ArrayListContinueAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll(Arrays.asList(100,95,85,65,85,55,45,73,35,47));
        ArrayList<Integer>gradeOfA=new ArrayList<>(scores);
        gradeOfA.removeIf(p->!(p>=90&&p<=100));
        System.out.println(gradeOfA);
        ArrayList<Integer>gradeOfB=new ArrayList<>(scores);
        gradeOfB.removeIf(p->!(p>=80&&p<=89));
        System.out.println(gradeOfB);
        ArrayList<Integer>gradeOfC=new ArrayList<>(scores);
        gradeOfC.removeIf(p->!(p>=70&&p<=79));
        ArrayList<Integer>gradeOfD=new ArrayList<>(scores);
        gradeOfD.removeIf(p->!(p>=60&&p<=69));
        ArrayList<Integer>gradeOfF=new ArrayList<>(scores);
        gradeOfF.removeIf(p->!(p<=60&&p>=0));
        gradeOfA.removeAll(gradeOfA);
        gradeOfB.removeAll(gradeOfB);
        gradeOfC.removeAll(gradeOfC);
        gradeOfD.removeAll(gradeOfD);
        System.out.println(gradeOfF);
        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);



    }
}
