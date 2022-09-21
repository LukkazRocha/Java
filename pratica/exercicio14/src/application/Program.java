/*Problema "dados_pessoas" 
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdFem, qtdMasc;
		double femMediaAltura, femTotalAltura, maiorAltura, menorAltura;
		
		System.out.print("Quantas pessoas serão cadastradas? ");
		n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		
		qtdFem = 0;
		qtdMasc = 0;
		femTotalAltura = 0;
		femMediaAltura = 0;
		
		for (int i = 0; i < pessoa.length; i++) {			
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, genero);
			
			if (pessoa[i].getGenero() == 'F') {
				femTotalAltura += pessoa[i].getAltura();
				qtdFem++;
			} else {
				qtdMasc++;
			}			
		}
		
		femMediaAltura = femTotalAltura / qtdFem;
		
		maiorAltura = pessoa[0].getAltura();
		menorAltura = pessoa[0].getAltura();
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			} 
			if (pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
		}
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", femMediaAltura);
		System.out.println("Numero de homens = " + qtdMasc);
		
		sc.close();
	}

}
