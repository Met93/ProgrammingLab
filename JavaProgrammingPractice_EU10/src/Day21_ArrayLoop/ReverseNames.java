package Day21_ArrayLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] classMates={"Ahmet","Hatice","Ali","Metin","Umut","Hande","Mehmet","Salih","Yavuz"};
        for (String each : classMates) {
            String reversed="";
            for (int i = each.length()-1; i >=0; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
