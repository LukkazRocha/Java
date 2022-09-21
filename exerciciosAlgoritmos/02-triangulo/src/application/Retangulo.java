/*Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double base, altura, area, perimetro, diagonal;
		
		System.out.println("Base do retângulo:");
		base = sc.nextDouble();
		System.out.println("Altura do retâgulo:");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}

}
