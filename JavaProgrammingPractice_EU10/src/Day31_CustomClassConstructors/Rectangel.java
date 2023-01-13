package Day31_CustomClassConstructors;

public class Rectangel {
    public double length,width;
    public Rectangel(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double calcArea(){
        return length*width;
    }
    public double calPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangel{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calPerimeter() +
                '}';
    }
}
