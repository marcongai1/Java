public class BankAccount{
    private String name, num; 
    private double bal;
    private static int bankAccountCounter;

    //Constructor
    public BankAccount(String name, String num, double bal){
        this.name = name;
        this.num = num;
        this.bal = bal;
        bankAccountCounter++;
    }

    //Default Constructor
    public BankAccount(){
        name = "";
        num = "";
        bal = 0.0;
        bankAccountCounter++;
    }

    public String toString(){
        return "Account Holder Name: " + name + " #: " + num + " Balance: $" + bal;
    }

    public void withdraw(double amount){
        if (this.bal >= amount){
            this.bal -= amount;
        }
        else{
            System.out.println("You are not able to withdraw this much... You are broke.");
        }
    }

    public void deposit(double amount){
        this.bal += amount;
    }

    public static void printCounter(){
        System.out.println("# of Bank Accounts: " + bankAccountCounter);
    }

    public static void main(String[] args){
        BankAccount test = new BankAccount("beans", "123", 100000);
        test.withdraw(1000);
        test.deposit(2938710);
        BankAccount.printCounter();
        System.out.println(test);
    }
}