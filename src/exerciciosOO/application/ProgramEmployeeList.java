package exerciciosOO.application;

import exerciciosOO.entities.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployeeList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<EmployeeList> list = new ArrayList<>();

        System.out.print("How many employees will be resistered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1)+ ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();// usado para consumir o buffer de quebra de linha que o nextInt deixa em aberto
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeList emp = new EmployeeList(id, name, salary);
            list.add(emp);
        }
        System.out.println();
        System.out.print("Enter the employee id the will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the porcent: ");
            double porcent = sc.nextDouble();
            list.get(pos).increaseSalary(porcent);
        }
        System.out.println();
        System.out.println("List of employee:");

        for(EmployeeList emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position (List<EmployeeList> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return 1;
            }
        }
        return null;
    }
}
