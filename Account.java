public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(); // Set initial state to Active
    }

    // Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    // Deposit money to the account
    public void deposit(double depositAmount) {
        accountState.deposit(this, depositAmount);
    }

    // Withdraw money from the account
    public void withdraw(double withdrawAmount) {
        accountState.withdraw(this, withdrawAmount);
    }

    // Suspend the account
    public void suspend() {
        accountState.suspend(this);
    }

    // Activate the account
    public void activate() {
        accountState.activate(this);
    }

    // Close the account
    public void close() {
        accountState.close(this);
    }

    // toString to display account details
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }
}
