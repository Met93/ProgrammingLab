package Day08_IfStatements;
import java.util.Scanner;
public class NumCost {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number and values at the same time: ");
        int num=input.nextInt();
        double cost=input.nextDouble();
        System.out.println("num = " + num+" \ncosts= "+cost);

    }
}
