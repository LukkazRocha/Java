/*Problema "media_pares" 
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double media = 0;
		int quantPar = 0;
		
		System.out.println("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				quantPar++;
			}			
		}
		
		if (quantPar > 0) {
			media = sum / quantPar;
			System.out.print("\nMEDIA DOS PARES = " + media);
		} else {
			System.out.println("\nNENHUM NÚMERO PAR");
		}
		
		sc.close();
	}

}
