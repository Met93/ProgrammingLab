package Day38_OOP_Inheritance_Overriding.car_Task;



public class BMW extends Car {
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down ever 100 miles");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing car");
    }
    @Override
    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}
