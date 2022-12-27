package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product p1 = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + p1);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        p1.addProducts(quantity);
        System.out.println("Updated data: " + p1);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);
        System.out.println("Updated data: " + p1);







        sc.close();
    }
}
