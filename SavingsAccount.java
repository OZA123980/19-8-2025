package AccountTest;
public class SavingsAccount {
        public double balance;
        public double interestRate = 0.01;
        public String name;


        public void cetakSaldo() {
            System.out.println("Customer: " + name);
            System.out.println("Balance: " + balance);
            System.out.println("Rate: " + interestRate);
            System.out.println("Interest: " + (balance * interestRate));
            System.out.println("-------------------------");
        }//end method displayCustomer
    }//end class SavingsAccount

