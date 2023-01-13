package Day39_EncapsulationAndInheritancePractice.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer=new Developer("Metin",28,'M',235235,"SDET",56000);
        Tester tester=new Tester("Ali",52,'M',12552,"Engineer",78000);
        Teacher teacher=new Teacher("Hatice",24,'F',2069,"Manul Tester",35435);
        Student student=new Student("Umut",26,'M',235235,"Solar Energie");
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println("-----------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);
        developer.work();
        tester.work();
        teacher.work();

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();
        System.out.println("------------------------------------");
        teacher.eat();
        teacher.drink();
        teacher.sleep();
        System.out.println("-----------------------------------------");
        student.eat();
        student.drink();
        student.drink();
        student.study();
}
}
