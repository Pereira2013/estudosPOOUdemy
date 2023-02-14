package exerciciosOO.application;

import exerciciosOO.entities.SaveAccount;

public class ProgramAccount {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc; // Account aceita atribuir BusinessAccount pois é uma conta
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SaveAccount(1004, "Anna", 0.0, 0.01);


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2; // para isso tem que fazer o casting manual
        acc4.loan(100.0); // para poder acessar a operacão loan

        //BusinessAccount acc5 = (BusinessAccount)acc3; // essa operacão não é permitida, mas o compilador não sabe definir

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("loan!");
        }
        if (acc3 instanceof SaveAccount) {
            SaveAccount acc5 = (SaveAccount)acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }

        // SOBREPOSICÃO
        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SaveAccount(1002,"Maria", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());



    }
}
