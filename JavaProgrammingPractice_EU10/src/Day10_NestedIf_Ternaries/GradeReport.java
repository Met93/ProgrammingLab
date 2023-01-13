package Day10_NestedIf_Ternaries;

public class GradeReport {
    public static void main(String[] args) {
    /*
    Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */
        byte number=6;
        if(number>=1&&number<=18){
            if(number>=1&&number<=5){
                System.out.println("Elementary school");
            } else if (number>=6&&number<=8) {
                System.out.println("Middle school");
            } else if (number>=9&&number<=12) {
                System.out.println("High school");
            } else if (number>=13&&number<=16) {
                System.out.println("College");
            }else {
                System.out.println("Grad School");
            }
        }else{
            System.out.println("Invalid grade level given");
        }
        System.out.println("-------------------");
        int score=95;
        if(score>=0&&score<=100){
            if(score>=90&&score<=100){
                System.out.println("Excellent");
            } else if (score>=80&&score<=89) {
                System.out.println("Great");
            } else if (score>=70&&score<=79) {
                System.out.println("Good");
            } else if (score>=60&&score<=69) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Enter the valid score");
        }
    }

}

