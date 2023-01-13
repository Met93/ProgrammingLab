package Day10_NestedIf_Ternaries;

public class FieldTrip {
    public static void main(String[] args) {
        int grade=2,
                groupNumber=0;
        String location="",
                teacher="";
        if(grade>=0&&grade<=6){
            if(grade==1){
                location="Apple orchard";
                groupNumber=3;
                teacher="Ms.Smith";

            }
        }else{
            System.out.println("Invalid Grade");
        }
        System.out.println("location = " + location+" group of Number "+groupNumber+" Name of teacher "+teacher);

    }

}
