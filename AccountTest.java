public class AccountTest {
    public static void main(String[] args) {
       
        Account myAccount = new Account("1234", 10000.0);

        
        myAccount.activate(); 
        
        // Suspend the account
        myAccount.suspend(); 
        
        //Activate the account

        myAccount.activate(); 
        System.out.println();

        //Deposit to the account
        myAccount.deposit(1000.0); 
        System.out.println();

       //Withdraw to the account
        myAccount.withdraw(100.0); 
        System.out.println();

       //Close the account()
        myAccount.close(); 
        System.out.println();

        //Activate the account
        myAccount.activate(); 
        //Suspend the account

        myAccount.suspend(); 
        System.out.println();
        
       //Withdraw to the account
        myAccount.withdraw(500.0); 
        System.out.println();

       //Deposit to the account
        myAccount.deposit(1000.0); 
    }
}
