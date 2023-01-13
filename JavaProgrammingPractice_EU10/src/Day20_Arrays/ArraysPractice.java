package Day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);
        System.out.println("-----------------");
        int[]score=new int[5];
        score[0]=10;
        score[1]=20;
        score[2]=30;
        score[3]=40;
        score[4]=50;
        score[score.length-1]=95;
        System.out.println(Arrays.toString(score));
        System.out.println(score[2]);
        String []month={"J","F","M","A","May","Jun","July","Augst","September","October","November","December"};
        System.out.println(month[0]);
        System.out.println(month[1]);
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);

        }
        System.out.println("-------------------");
        for (int j = month.length-1; j >=0 ; j--) {
            System.out.println(month[j]);
        }

    }
}
