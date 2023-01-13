package week02_09_17_2022;

public class ReminderPractice {
    public static void main(String[] args) {
        /*
        8. Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
         */
        int min=3456789;
        int day = min / (24*60);
        int  year = day / 365;
        int remainingDays= day % 365;
        System.out.println(min+ " minutes is approximately "+year+" years and "+remainingDays+" days");

    }
}
