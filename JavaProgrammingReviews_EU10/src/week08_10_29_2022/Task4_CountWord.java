package week08_10_29_2022;

public class Task4_CountWord {
    public static void main(String[] args) {
        String []names={"Anna","Mike","Aliya","Donald","Muhtar","Remus","Mehmet","Asya"};
        int count=0;
        for (String each : names) {
            String first=each.charAt(0)+"";
            String last=each.charAt(each.length()-1)+"";
            if(first.equalsIgnoreCase(last)){
                count++;
            }
        }
        System.out.println(count);

    }
}
