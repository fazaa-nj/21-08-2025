public class SavingsAccount {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void deposit(int x){
        balance += x;
    }//end method deposit

    public double calcInterest(){
        return balance * interestRate;
    }

public void displayCustomer() {
    System.out.println("Customer: " + name);
    System.out.println("balance: " + balance);
    System.out.println("rate: " + interestRate);
     System.out.println();
    
}//end methode displayCustomer

}//end class SavingsAccount
