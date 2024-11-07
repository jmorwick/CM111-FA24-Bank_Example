public class Account {
    private double balance = 0;

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawl(double amount) {
        balance -= amount;
    }
}