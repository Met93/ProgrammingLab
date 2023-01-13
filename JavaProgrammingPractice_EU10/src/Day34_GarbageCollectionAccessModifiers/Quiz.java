package Day34_GarbageCollectionAccessModifiers;

import java.util.ArrayList;

public class Quiz {
    public static int[]method(String  str){
        int[]arr=new int[str.length()];
        int n=10;
        for (int i = 0; i < arr.length; i++) {
            if(n==20||n==50||n==70){
                continue;
            }
            arr[i]=n;
            n*=10;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(method("mark"));
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.remove(nums.size()-1);
        nums.add(2);
        nums.add(10);
        nums.add(0,6);
        nums.remove(1);
        nums.add(-7);
        nums.add(2,2);
        nums.add(null);
        System.out.println(nums);
        ArrayList<String>strs=new ArrayList<>();
        strs.add("j");
        strs.add(0,"1");
        strs.add("i");
        strs.add(2,"5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");
        System.out.println(strs);
    }
}
