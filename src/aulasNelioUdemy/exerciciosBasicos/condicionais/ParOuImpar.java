package aulasNelioUdemy.exerciciosBasicos.condicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero = sc.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }



        sc.close();
    }
}
