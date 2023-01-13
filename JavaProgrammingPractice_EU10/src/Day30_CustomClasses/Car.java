package Day30_CustomClasses;

import java.util.ArrayList;

public class Car {
    public String model;
    public String brand;
    public String color;
    public int year;
    public double price;
    /*
    public void setInfo(String carModel,String carBrand,String carColor,int carYear,double carPrice){
        model=carModel;
        brand=carBrand;
        color=carColor;
        year=carYear;
        price=carPrice;
    }
    */

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }
    public void start(){
        System.out.println(brand+" "+model+" has started");
    }
    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }


}
