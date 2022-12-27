package exerciciosOO.entities;

public class Bank {
    private int account;
    private String holder;
    private double deposit;


    public Bank(int account, String holder) {
        this.account = account;
        this.holder = holder;
    }

    public Bank(int account, String holder, double initialDeposit) {
        this.account = account;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccount() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposit() {
        return deposit;
    }

    public void deposit(double amount){
        deposit += amount;
    }

    public void withDraw(double amount) {
        deposit -= amount + 5.00;
    }

    @Override
    public String toString() {
        return "Account: " + account +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", deposit);
    }
}
