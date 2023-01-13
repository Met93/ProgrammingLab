package Day08_IfStatements;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        String Item1,Item2,Item3,report;
        double price1,price2,price3,totalPrice;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Item1 and its price: ");
        Item1=input.next();
        price1= input.nextDouble();
        System.out.println("Enter Item2 and its price: ");
        Item2=input.next();
        price2=input.nextDouble();
        System.out.println("Enter Item3 and its price: ");
        Item3=input.next();
        price3=input.nextDouble();
        totalPrice=price1+price2+price3;
        report="Item 1: "+Item1+" Price 1: "+price1+" Item 2: "+Item2+" Price 2: "+price2+" Item 3: "+Item3+" Price 3: "+price3+"\n Total Price is "+totalPrice;
        System.out.println(report);
    }
}
