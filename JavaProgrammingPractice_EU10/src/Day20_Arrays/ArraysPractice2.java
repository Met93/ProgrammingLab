package Day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];
        for(char i='A',j=0;i<='Z'&&j<letters.length;i++,j++){
            letters[j]=i;
        }
        System.out.println(letters);
        for (int i = 0,j='A'; i < letters.length; i++,j++) {
            letters[i]=(char)j;
        }
        System.out.println("-----------------------------------");
        char ch='A';
        for(int i=0;i<letters.length;i++){
            letters[i]=ch++;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-----------------------------------");
        char[]letters2=new char[26];//Z-A
        char zn='Z';
        for(int i=letters2.length-1;i>=0;i--){
            letters2[i]=zn--;
        }
        System.out.println(letters2);

    }
}
