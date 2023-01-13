package Day29_ArrayListContinueAndCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));//BulkOperation you can add  aarray list with this method at once;
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,2) );
        System.out.println(list);
        System.out.println("--------------------------");
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,3,4,5,8,6,7));
        numbers.retainAll(Arrays.asList(2,5,7));
        System.out.println(numbers);
        System.out.println("-------------------------------");
        ArrayList<String>jobTitels=new ArrayList<>();
        jobTitels.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));
        jobTitels.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitels);
        System.out.println("-----------------------------------");
        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,2,3,4,5,6,7,8,8,9));
        boolean r3=nums.containsAll(Arrays.asList(1,2,5));
        boolean r1=nums.contains(6);
        boolean r2=nums.contains(2)&&nums.contains(3)&&nums.contains(5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("------------------------------------");
        String[]names={"Josh","Jack","Daniel","Shay","Breanna"};
        ArrayList<String>nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        ArrayList<String>nameList2=new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList2);
        int []arr={1,2,3,4,5,6,6,7,8,9,10};
        // you can add just non-primiteves array to the arrayList
        //Integer[]arr={1,2,3,4,5,6,7};
        //ArrayList<Integer<listed=new ArrayList<<(Arrays.asList(arr))
        ArrayList<Integer>listed=new ArrayList<>();
        System.out.println("----------------------------------------");
        ArrayList<Integer>list3=new ArrayList<>(convertArraytoArrayList(arr));
        System.out.println(Arrays.toString(arr));



    }
    public static ArrayList<Integer> convertArraytoArrayList(int[]array){
        ArrayList<Integer>list=new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
