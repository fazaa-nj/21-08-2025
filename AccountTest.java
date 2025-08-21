public class AccountTest {public static void main(String[] args) {
    SavingsAccount sa0001 = new SavingsAccount();
    sa0001.name = "Faza";
    sa0001.balance = 5000;
    sa0001.deposit(1000);
    sa0001.balance += sa0001.calcInterest();
    sa0001.balance += 0.5;
    sa0001.displayCustomer();

     SavingsAccount sa0002 = new SavingsAccount();
    sa0002.name = "Celyn";
    sa0002.balance = 9000;
    sa0002.deposit(2000);
    sa0002.balance += sa0002.calcInterest();
    sa0002.balance += 0.01;
    sa0002.displayCustomer();

    SavingsAccount sa0003 = new SavingsAccount();
    sa0003.name = "Vanessa";
    sa0003.balance = 10000;
    sa0003.deposit(3000);
    sa0003.balance += sa0003.calcInterest();
    sa0003.balance += 0.03;
    sa0003.displayCustomer();
    
}//end methode main
    
}//end class AccountTest
