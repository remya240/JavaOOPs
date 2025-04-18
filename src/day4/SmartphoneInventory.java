
package day4;

/*You are tasked with designing a system to manage a store's inventory of Smartphones.
Implement a Java program that includes the following:
The Smartphone class with private attributes for brand, model, and price, 
along with appropriate constructor, getter, and setter methods.
The Smartphone Inventory class that manages a collection of smartphones, 
display the details of all smartphones in the inventory.
In the Smartphoneinventory class:
			Create an instance of Smartphone.
			Add at least two different smartphones to the inventory.
			Display the Initial inventory details.
			Change the details of the smartphones.
			Display the updated inventory details.
			Make sure to demonstrate the proper encapsulation and use of getter and setter methods.
Sample input: 
			samsung 
			Galaxy S21
			999.09
			=======
			Google
			Pixel 6
			899.99
Sample Output :
			Initial Smartphone Information:
			Brand: Samsung
			Model: Galaxy S21
			Price: $999.99
			===============================
			Updated Smartphone Information:
			Brand: Apple
			Model: iPhone 13.
			Price: $1099.99
			===============================
			Initial Smartphone Information:
			Brand: Google
			Model: Pixel 6
			Price: $899.99
			===============================
			Updated Smartphone information:
			Brand: Mi
			Model: Note 9 Pro
			Price: $399,99
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Smartphone {
	private String brand;
	private String model;
	private double price;

	Smartphone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: $" + price);
	}
}

public class SmartphoneInventory {

	public static void main(String[] args) {
		List<Smartphone> inventory = new ArrayList<>();
		Smartphone phone1 = new Smartphone("Samsung", "Galaxy S21", 999.99);
		Smartphone phone2 = new Smartphone("Google", "Pixel 6", 899.99);
		inventory.add(phone1);
		inventory.add(phone2);
		System.out.println("Initial Smartphone Information:");
		phone1.display();
		System.out.println("===============================");
		phone2.display();
		System.out.println("===============================");
		phone1.setBrand("Apple");
		phone1.setModel("iPhone 13");
		phone1.setPrice(1099.99);

		phone2.setBrand("Mi");
		phone2.setModel("Note 9 Pro");
		phone2.setPrice(399.99);
		System.out.println("\nUpdated Smartphone Information:");
		phone1.display();
		System.out.println("===============================");
		phone2.display();
		System.out.println("===============================");

	}
}
