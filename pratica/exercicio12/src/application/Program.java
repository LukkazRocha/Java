/*Problema "mais_velho"" 
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade, posicaoMaior;
		
		System.out.println("Quantas pessoas serão cadastradas: ");
		n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª Pessoa: \n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();	
			vect[i] = new Pessoa(nome, idade);
		}
		
		maiorIdade = vect[0].getIdade();
		posicaoMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() > maiorIdade) {
				maiorIdade = vect[i].getIdade();
				posicaoMaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", vect[posicaoMaior].getName());
		
		sc.close();
	}

}
