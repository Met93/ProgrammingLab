package Day17_WhileAndDoWhile;

public class FrequencyOfString2 {
    public static void main(String[] args) {
        String str="Cat Cat Dog Dog cAt CAT caT";
        int frequency=0;
        for (int i = 0; i <= str.length()-3; i++) {
            String eachSubstring=str.substring(i,i+3);
            if(eachSubstring.equalsIgnoreCase("Cat")){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
