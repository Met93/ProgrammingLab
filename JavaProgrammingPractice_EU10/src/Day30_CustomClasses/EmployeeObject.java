package Day30_CustomClasses;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setInfo("Metin",235235,'M',"TestEngineer",true,55000);
        Employee employee2=new Employee();
        employee2.setInfo("Umut",235235,'M',"TestEngineer",true,65000);
        Employee employee3=new Employee();
        employee3.setInfo("Hatice",234235,'F',"Engineer",false,45000);
        Employee employee4=new Employee();
        employee4.setInfo("Ayse",232135,'F',"Butcher",true,45000);
        Employee employee5=new Employee();
        employee5.setInfo("Hosni",235346,'F',"TestEnginner",true,45500);
        Employee[]employeesList={employee1,employee2,employee3,employee4,employee5};
        int countFullTime=0;
        int countPartTime=0;
        double max=employeesList[0].salary;
        double min=employeesList[0].salary;
        for (Employee each : employeesList) {
            if(each.isFulltime) {
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(each.salary>max){
                max=each.salary;
            }
            if(each.salary<min){
                min=each.salary;
            }
        }
        System.out.println(countFullTime);
        System.out.println("--------------------------");
        System.out.println(countPartTime);
        System.out.println(min);
        System.out.println("--------------------");
        System.out.println(max);
    }
}
