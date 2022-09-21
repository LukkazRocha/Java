/*Problema "abaixo_da_media"
 Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		double total = 0;
		
		System.out.println("Quantos elementos terá o vetor?");
		int n = sc.nextInt();		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			total += vect[i];
		}
		
		media = total / vect.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}