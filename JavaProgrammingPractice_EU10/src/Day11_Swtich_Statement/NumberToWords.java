package Day11_Swtich_Statement;

public class NumberToWords {
    public static void main(String[] args) {
        int number=7;
        String result=(number>=0&&number<=9)?(number==1)?"One":(number==2)?"Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"Five":(number==6)?"Six":(number==7)?"Seven":(number==8)?"Eight":"Nine":"Invalid number has given";
        System.out.println(result);
    }
}
