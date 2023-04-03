package application;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
						
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity); 
		
		System.out.println();
		System.out.println("Product data: "  + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added to Stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "  + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: "  + product);
		
		sc.close();
	}

}
