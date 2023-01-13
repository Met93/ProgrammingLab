package Day31_CustomClassConstructors;

public class PizzaTask {
    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public PizzaTask(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "PizzaTask{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                "i total price= $"+calcCost()+
                '}';
    }

    public double calcCost(){
        double startingPrice=(size=='S')?10:(size=='M')?12:14;
        double totalPrice=startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        return totalPrice;
    }
}
