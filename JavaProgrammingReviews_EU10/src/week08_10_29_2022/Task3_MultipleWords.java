package week08_10_29_2022;

public class Task3_MultipleWords {
    public static void main(String[] args) {
        String str="knife, wooden spoon, plates, cups,forks, pan, pot,trash,fridge,dish washer";
        String[]word=str.split(", ");
        System.out.println();
        for (String each : word) {
            if(each.contains(" ")){//condition for multiple words
                System.out.println(each);
            }
        }
    }
}
