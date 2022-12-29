package exerciciosOO.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPersona {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + " person data");
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += height[i];
        }
        double avg = sum / n;

        System.out.println();
        System.out.printf("Average height: %.2f%n", avg);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                count += 1;
            }
        }

        double porcent = count * 100.0 / n;

        System.out.printf("people under 16 years old: %.1f%%%n", porcent);
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }




        sc.close();
    }
}
