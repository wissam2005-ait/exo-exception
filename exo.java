public class exo {
    private String accountNumber;
    private double balance;

    public exo(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
            
    }

    public void debit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Debit amount cannot be negative");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public void credit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Credit amount cannot be negative");
        }
        balance += amount;
    }
}