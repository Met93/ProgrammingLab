package Day11_Swtich_Statement;

public class Grade2 {
    public static void main(String[] args) {
        char ch='D';
        String result="";
        switch (ch){
            case 'A': case 'B': case 'C': case 'D':
                result="Passed";
                break;
            default:
                result="Failed";
        }
        System.out.println(result);
    }
}
