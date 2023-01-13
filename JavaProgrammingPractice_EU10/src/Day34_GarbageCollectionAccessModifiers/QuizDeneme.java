package Day34_GarbageCollectionAccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizDeneme {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>(Arrays.asList("during","strom","rain","fell","season","cloudy","safe"));
        ArrayList<Integer>lengths=new ArrayList<>();
        for (String word : words) {
           lengths.add(word.length());
        }

    }
}
