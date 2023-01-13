package Day32_CustomClass_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee (String name){//Constructor
        this.name=name;
    }
    public Employee(String name,char gender){
        //Employee(name);
        this(name);//overloading constructor call
        this.gender=gender;
    }
    public Employee (String name,char gender,String jobTitle){
      this(name,gender);// we are using it for avoding dublication
        this.jobTitle=jobTitle;
    }
    public Employee(String name,char gender,String jobTitle,double salary){
        this(name,gender,jobTitle);
        this.salary=salary;
    }
    public void method1(){
        //this("Aaron"); this can be called only in another constructor
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
