/*Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
9/5) + 32 = 32 °F.*/

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		double c, f;
		
		System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
		c = sc.nextDouble();
		
		f = converteParaFahrenheit(c);
		
		System.out.printf("O equivalente a %.0f C é %.1f F.", c, f);
		
		sc.close();
	}
	
	private static double converteParaFahrenheit(double c) {
		return c * 1.8 + 32;
	}

}
