/*Escreva um programa que informa a tabuada de multiplicação de um número informado pelo
usuário (entre 1-10)*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número de 1 a 10: ");
		int n = sc.nextInt();
		
		System.out.printf("A tabuada de %d é:%n%n", n);
		for (int i = 1; i <= 10; i++) {
			int tab = i * n;
			System.out.printf("%d x %d = %d%n%n", n, i, tab);
			
		}
		
		
		sc.close();
	}

}
