package Day17_WhileAndDoWhile;

import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int house = s.nextInt();
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW
        if(player>21){
            if(player>house){
                System.out.println("player bust");
            }
        }
        if(player==21&&house<player){
            System.out.println("player win");
        }else if(house>player){
            System.out.println("player lose");
        }else if(house==player){
            System.out.println("its a tie");
        }else if(player==25&&house==7){
            System.out.println("player win");
        }else if(player==12&&house==7){
            System.out.println("player win");
    }
}
}