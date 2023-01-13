package Day11_Swtich_Statement;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=9;
        String result="";
        if(number>=1&&number<=12){
            switch (number){
                case 2:
                    result="28 Days";
                    break;
                case 4:case 6: case 9: case 11:
                    result="30 Days";
                    break;
                default:
                    result="31 Days";
            }
        }else{
            result="Invalid number has been given";
        }
        System.out.println(result);
    }
}
