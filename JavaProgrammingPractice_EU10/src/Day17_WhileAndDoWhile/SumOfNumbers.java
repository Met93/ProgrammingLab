package Day17_WhileAndDoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int ilkSayi = scan.nextInt();
        System.out.println("Enter a second Number:");
        int ikinciSayı = scan.nextInt();
        int sum;
        boolean kosul = true;
        sum = ilkSayi + ikinciSayı;
        System.out.println(sum);
        System.out.println("Devam etmek istiyor musun");
        String yanit = scan.next().toLowerCase();
        if (yanit.equals("yes")) {

            while (kosul) {
                System.out.println("ilk sayı");
                ilkSayi = scan.nextInt();
                System.out.println("İkinci sayı");
                ikinciSayı = scan.nextInt();
                sum = ilkSayi + ikinciSayı;
                System.out.println(sum);
                System.out.println("Devam etmek istiyor musun: ");
                yanit = scan.next();
                if (yanit.equals("yes")) {
                    continue;
                } else {
                    System.out.println(sum);
                    System.exit(1);
                }
            }
        } else {
            System.out.println(sum);
        }

    }
}
