/*Problema "soma_vetores"
 Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Quantos valores terá cada vetor?");
		int n = sc.nextInt();
		
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorC[] = new int[n];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores do vetor A:");
			vetorA[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite os valores do vetor B:");
			vetorB[i] = sc.nextInt();
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
		
		sc.close();
	}

}
