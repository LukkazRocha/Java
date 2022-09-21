/*Problema "numeros_pares"
 Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int vect[] = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		int quantPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				quantPares++;
				System.out.printf("%d  ",vect[i]);
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", quantPares);
		
		sc.close();
	}

}
