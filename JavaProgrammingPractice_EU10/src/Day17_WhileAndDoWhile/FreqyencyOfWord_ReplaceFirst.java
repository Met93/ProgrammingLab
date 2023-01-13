package Day17_WhileAndDoWhile;

public class FreqyencyOfWord_ReplaceFirst {
    public static void main(String[] args) {
        String str="Java Java Python Python";
        int frequency=0;
        while(str.contains("Java")){
            str=str.replaceFirst("Java","");
            frequency++;
        }
        System.out.println(frequency);
        String s="java java java python python python";
        int counJava=0,
                countPython=0;
        while(s.contains("java")&&s.contains("python")){
            if(s.contains("java")){
                s=s.replaceFirst("java","");
                counJava++;
            }
            if(s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
            }

        }
    }
}
