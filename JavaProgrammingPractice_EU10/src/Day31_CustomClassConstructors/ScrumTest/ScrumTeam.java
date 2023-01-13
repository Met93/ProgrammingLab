package Day31_CustomClassConstructors.ScrumTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;
    public ArrayList<Tester>testersList=new ArrayList<>();
    public ArrayList<Developer>devopsList=new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM,  int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testersList = testersList;
        this.devopsList = devopsList;
        this.daysOfSprint = daysOfSprint;
    }
    public void AddTester(Tester tester){
        testersList.add(tester);
    }
    public void AddTesters(Tester[]testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[]developer){
        devopsList.addAll(Arrays.asList(developer));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p->p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
