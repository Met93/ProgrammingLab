package Day38_OOP_Inheritance_Overriding.car_Task;

public class ParkingLot {// has a relation between toyota
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry",2020,20000,"Gray",123456);

        Tesla tesla=new Tesla("Model S",2022,94990,"Red",0);
        BMW bmw=new BMW("X5",2020,67350,"Red",12000);
        toyota.start();
        tesla.start();
        bmw.start();
    }
}