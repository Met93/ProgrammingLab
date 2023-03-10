package Day32_CustomClass_Constructors;

public class Carpet {
    public double width,length,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double totalPriceOfCarpet=(width*length)*unitPrice;
        if(isPersian){
            totalPriceOfCarpet+=200;
        }
        return totalPriceOfCarpet;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
