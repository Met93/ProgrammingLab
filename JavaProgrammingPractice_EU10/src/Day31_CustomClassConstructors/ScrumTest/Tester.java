package Day31_CustomClassConstructors.ScrumTest;

public class Tester {
    public String name,JobTitle;
    public int employeeID;
    public double salary;

    public Tester(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating Ticket");
    }
}
