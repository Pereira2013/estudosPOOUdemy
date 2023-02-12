package exerciciosOO.entities;

import exerciciosOO.application.Account;

public class SaveAccount extends Account {
    private Double interestRate;

    public SaveAccount() {
        super();
    }

    public SaveAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}