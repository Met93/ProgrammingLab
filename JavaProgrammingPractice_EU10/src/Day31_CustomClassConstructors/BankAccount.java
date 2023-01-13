package Day31_CustomClassConstructors;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }
    public void deposit(double amount){
        if(amount<0){
            System.err.println("Deposit amount can not be zero or negative");
            return;//exits the method
        }
        balance+=amount;
    }
    public void withDraw(double amount){
        if(amount>balance){// if withdrawing amount is greater than available balance
            System.out.println("Insufficient balance");
            return;
        }
        if(amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance-=amount;
    }
}
