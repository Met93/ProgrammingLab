package Day30_CustomClasses;

public class Employee {
    /*
    Attributes:name,id,gender,jobTitle,salary,isFullTime(boolean)
    Actions:toString():to be able to print each employee object
    setInfo():to be able to set all the attributes
    work():....
    CapitalOne Class:
    1.create 5 Employee objects into an array
    2.store those 5 employee objects into an array
    3.how many employees are full time employees?
    4.What's the minimum salary
    5.What's the max salary
     */
    public String name;
    public int ID;
    public char gender;
    public String jobTitel;
    public boolean isFulltime;
    public double salary;

    public void setInfo(String name, int ID, char gender, String jobTitel, boolean isFulltime, double salary) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitel = jobTitel;
        this.isFulltime = isFulltime;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitel='" + jobTitel + '\'' +
                ", isFulltime=" + isFulltime +
                ", salary= $" + salary +
                '}';
    }
    public void work(){
        System.out.println(jobTitel+" "+name+ " is working");
    }
}
