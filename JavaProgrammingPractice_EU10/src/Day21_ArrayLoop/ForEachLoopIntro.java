package Day21_ArrayLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[]numbers={1,2,3};
        for(int each:numbers){//,:indexes of the array
            System.out.println(each);
        }
        System.out.println("------------------");
        int []num={10,20,30,40,50,60,70};
        //          0  1  2 3  4  5  6
        for (int i = 0; i < num.length; i++) {//each:elements of the array
            int eachElement=num[i];
            System.out.println(eachElement);
        }
    }
}
