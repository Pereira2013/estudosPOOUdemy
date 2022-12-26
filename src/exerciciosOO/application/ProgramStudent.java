package exerciciosOO.application;

import exerciciosOO.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("Grade 1 : ");
        student.grade1 = sc.nextDouble();
        System.out.println("Grade 2 : ");
        student.grade2 = sc.nextDouble();
        System.out.println("Grade 3 : ");
        student.grade3 = sc.nextDouble();

        if (student.finalGrade() > 60.00) {
            System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }







        sc.close();
    }
}
