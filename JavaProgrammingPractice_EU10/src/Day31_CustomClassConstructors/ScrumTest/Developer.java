package Day31_CustomClassConstructors.ScrumTest;

public class Developer {
    public String name,JobTitle;
    public int employeeID;
    public double salary;

    public Developer(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }
    public void coding(){
        System.out.println(name+ "is coding");
    }
    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }
}
