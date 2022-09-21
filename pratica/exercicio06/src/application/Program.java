/*Problema "alturas"
 
 Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int menores = 0;
		System.out.println("Quantidade de pessoas: ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();			
			vect[i] = new Pessoa(nome, idade, altura);	
			
			soma += vect[i].getAltura();
			
			if (vect[i].getIdade() < 16) {
				menores++;
			}			
			
		}	
		
		double media = soma / vect.length;
		System.out.printf("Altura média: %.2f%n", media);
		
		if (menores > 0) {
			double percentualMenores = ((double)menores / vect.length) * 100;
			System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i].getIdade() < 16) {
					System.out.println(vect[i].getNome());
				}
			}
		}			
		
		sc.close();
	}

}
