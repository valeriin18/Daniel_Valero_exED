package entornos;

import java.util.Scanner;

public class ConviertidorDeTemperatura {
	public static void main(String [] args) {
		insertarGrados();
	}
	public static void insertarGrados() {
		Scanner input = new Scanner(System.in);
			System.out.println("Introduce los grados farenheit para convertir en celsius:");
			double farenheit = input.nextDouble();
			System.out.println();
			System.out.println("Los grados farenheit en celsius son: " + fahrenheitToCelsius(farenheit));
			System.out.println();
			System.out.println("Introduce los grados celsius para convertir en farenheit:");			
			double celsius = input.nextDouble();
			System.err.println();
			System.out.println("Los grados celsius en farenheit son: " + celsiusToFahrenheit(celsius));
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
}

