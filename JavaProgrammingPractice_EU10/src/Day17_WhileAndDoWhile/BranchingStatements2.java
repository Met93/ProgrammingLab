package Day17_WhileAndDoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <'E' ; i++) {
            if(i=='C'){
                continue;
            }
            System.out.println(i);
        }
    }
}
