package Day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name="Josh";
        int age=38;
        String citizien="USA";
        boolean isEligible=age>=21&&citizien=="USA";
        //Eligible
        if (isEligible){
            System.out.println("Eligible");
        }

        //Not Eligible
        if(isEligible){
            System.out.println("Not Eligible");
        }
    }
}
