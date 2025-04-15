package abstractclass;

import java.util.Scanner;

public class Farenheit {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter temperature in Centigrade: ");
			float temperature = Float.parseFloat(scanner.nextLine());
			float fahrenheitTemp = covertcentigratetofarenheit(temperature);
			System.out.println("Temperature in Fahrenheit: " + fahrenheitTemp);
		} catch (NumberFormatException e) {
			
		}

	}

	public static float covertcentigratetofarenheit(float temperature) {
		return (9 * temperature) / 5 + 32;

	}
}
