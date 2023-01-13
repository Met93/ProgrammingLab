package Day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);//what are the benefits that have when you use the setName
        setChar(gender);
        setAge(age);
        setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    private double salary;

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return  age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){

        if(name.isEmpty()){
            System.err.println("Invalid entry");//when you use error message program have to exit Or use return
            System.exit(0);
        }
        this.name=name;

    }
    public void setChar(char gender){
        if(!(gender=='M'||gender=='F')){
            return;
        }
        this.gender=gender;

    }
    public void setAge(int age){
      if(age<16||age>90){
          return;
      }
        this.age=age;

    }
    public void setSalary(double salary){
        if(salary<=0){
            return;
        }
        this.salary=salary;

    }
}
