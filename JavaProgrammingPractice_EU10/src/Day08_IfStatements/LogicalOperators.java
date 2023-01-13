package Day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        int age=19;
        String citizien="USA",
                name="Steven";
        boolean isEligible=age>=18&&citizien=="USA";
        System.out.println(name+" is eligible to vote: "+isEligible);
        System.out.println("-------------------------------------");
        String name2="Josh";
        int creditScore=720;
        int age2=23;
        int income=40000;
        boolean isEligible2=creditScore>=700&&age2>=21&&income>=60000;
        System.out.println(name2+" is eligible for loan:  = " + isEligible2);
        String name3="Shay";
        int age3=21;
        char gender='F';
        boolean isEligible3=age3>=18&&(gender=='M'||gender=='F');
        //                        21>=18 && ('F'=='M' || 'F'=='F')
        //                         true&&(false||true)
        //                         true
        System.out.println(name3 +" is eligible to register:  = " + isEligible3);
        System.out.println("-----------------------------");
        String name4="James;";
        String countryOfBirth="UK";
        boolean marriedToUsCitizien=false;
        boolean isEligible4= countryOfBirth=="USA"||marriedToUsCitizien==true;
        //                      false||false
        System.out.println(name4+" is eligible to apply for US citizien = " + isEligible4);
        String student="Anna";
        double gpa=2.5;
        int familyIncome=400000;
        boolean isEligible5=gpa>=3.5||familyIncome<=60000;
        System.out.println(student+ " is eligible for scholarship:  = " + isEligible5);
        boolean result2=true;
        System.out.println("result2 = "+result2);
        boolean result3=!result2;
        System.out.println("result3 = " + result3);
        System.out.println("-----------------------------------------");
        int score= 85;
        boolean passed=score>=60;
        boolean failed=!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }
}
