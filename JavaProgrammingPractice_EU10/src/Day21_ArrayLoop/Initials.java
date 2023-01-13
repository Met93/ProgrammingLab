package Day21_ArrayLoop;

public class Initials {
    public static void main(String[] args) {
        String[] classMates={"Ahmet","Hatice","Ali","Metin","Umut","Hande","Mehmet","Salih","Yavuz"};
        for (String each : classMates) {
            String initial=each.charAt(0)+""+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }

    }
}
