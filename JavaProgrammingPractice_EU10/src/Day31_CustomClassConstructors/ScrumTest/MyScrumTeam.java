package Day31_CustomClassConstructors.ScrumTest;

public class MyScrumTeam {
    public static void main(String[] args) {
        //4 testers objects
        Tester tester1=new Tester("Metin","QA",878767,53000);
        Tester tester2=new Tester("Ahmet","SDET",5734578,52000);
        Tester tester3=new Tester("Umut","SE",892589,55000);
        Tester tester4=new Tester("Halil","SE",293058,52000);
        Tester[]testers={tester1,tester2,tester3};
        //5 developers objects
        Developer developer1=new Developer("Ahmet","Java Developer",22,125000);
        Developer developer2=new Developer("Serdar","Java Master",29,185000);
        Developer developer3=new Developer("Tunc","Java Developer",28,200000);
        Developer[]developers={developer1,developer2,developer3};
        //1 ScrumTeam Object
        ScrumTeam scrum=new ScrumTeam("Metin","Ahmet","Neira",14);
        scrum.addDeveloper(developer1);
        //scrum.addTester(tester1) eklenemedi bak
        //scrum.addTesters(testers)
        scrum.addDevelopers(developers);
        System.out.println(scrum);
        System.out.println("---------------------------------------------");
        for(Tester eachTester:scrum.testersList){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }
        System.out.println("----------------------------------------------");
        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }
        scrum.removeTester(23);
        scrum.removeDeveloper(28);
        System.out.println(scrum);

    }


}
