package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class Deneme5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();

        //WRITE YOUR CODE HERE:
        int price=0;
        boolean a=numberOfBedrooms==1||numberOfBedrooms==3||numberOfBedrooms==2||numberOfBedrooms==5;
        if(a){
            if(numberOfBedrooms==1){
                price=1100;
                System.out.println("One Bedroom Selected");
                System.out.println("Starting Price: "+price);
            }
            else if (numberOfBedrooms==2) {
                price=1850;
                System.out.println("Two Bedroom Selected");
                System.out.println("Starting Price: "+price);
            }
            else if(numberOfBedrooms==3){
                price=2550;
            System.out.println("One Bedroom Selected");
            System.out.println("Starting Price: "+price);
            }
        } else{
            System.out.println("Sorry, we do not offer that many bedrooms");
        }
    }
}
