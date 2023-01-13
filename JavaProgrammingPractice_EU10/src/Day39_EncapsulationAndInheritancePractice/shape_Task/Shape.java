package Day39_EncapsulationAndInheritancePractice.shape_Task;

public class Shape {
    /*
    Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}

     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);//1: something went wrong
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);

        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;// if you dont have to have body use it if you dont have any specific knowledge about smoething
    }
    public double perimeter(){
        return 0;
    }
    /*
    public String roString(){
     */

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }

}
