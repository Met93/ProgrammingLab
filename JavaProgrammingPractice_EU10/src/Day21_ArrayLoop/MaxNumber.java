package Day21_ArrayLoop;

public class MaxNumber {
    public static void main(String[] args) {
       int[]numbers={10,5,4,20,1,0};
       int max=numbers[0];
       int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println("---------------");
        for(int each:numbers){
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);
        System.out.println("---------------");
        for (int each : numbers) {
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);
    }
}
