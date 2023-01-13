package Day21_ArrayLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[]word={"Java","Java","C#","Python","Python"};
        for (String each: word) {
            int count=0;
            for (String element : word) {
                if(element.equals(each)){
                    count++;
                }
        }
            if(count==1){
                System.out.println(each);
            }
        }
    }
}
