/*Problema "aprovados" 
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		
		System.out.println("Quantos alunos serão cadastrados? ");		
		int n = sc.nextInt();
		
		Aluno[] vect = new Aluno[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome, a primeira e segunda nota do %dº aluno\n", i + 1);
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double media = (nota1 + nota2) / 2;
			vect[i] = new Aluno(nome, nota1, nota2, media);			
		}	
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getMedia() >= 6.0) {				
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
