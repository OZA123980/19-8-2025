package AccountTest;
public class AccountTest {
    public static void main(String[] args) {

        SavingsAccount sa0001= new SavingsAccount();
        sa0001.balance = 1000;
        sa0001.name = "Fauza";
        sa0001.interestRate = 0.02;
        sa0001.cetakSaldo();
    
        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.balance = 2000;
        sa0002.name = "Akbar";
        sa0002.interestRate = 0.03;
        sa0002.cetakSaldo();
    }//end method main
}//end class AccountTest
