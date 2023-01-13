package Day11_Swtich_Statement;

public class DaysInWeek {
    public static void main(String[] args) {
        int number=5;
        switch (number){//1,2,3,4,5
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuersday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunnday");
                break;
            default:
                System.out.println("Invalid number has been given");

        }
    }
}
