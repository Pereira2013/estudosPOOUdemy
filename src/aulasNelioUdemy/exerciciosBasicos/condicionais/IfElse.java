package aulasNelioUdemy.exerciciosBasicos.condicionais;

import java.util.Scanner;

public class IfElse {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 0) {
            System.out.println(" Negativo");
        }else {
            System.out.println(" Não Negativo");
        }



        sc.close();
    }
}
