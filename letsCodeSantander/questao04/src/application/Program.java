/*Um supermercado anuncia diariamente uma lista com 5 frutas em promoção. Escreva um
programa que recebe o nome de uma fruta que você deseja comprar e informa se a fruta
pertence à lista de promoções. */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		String[] lista = { "banana", "maçã", "abacaxi", "melão", "mamão" };
		boolean promoFruta = false;
		
		System.out.print("A lista de frutas em promoção é: [ ");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
		System.out.print("]\n\n");
		
		System.out.println("Qual fruta você deseja comprar hoje?");
		String fruta = sc.nextLine();
		for (int i = 0; i < lista.length; i++) {			
			if (fruta.equalsIgnoreCase(lista[i])) {
				promoFruta = true;
			}
		}
		
		if (promoFruta) {
			System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
		} else {
			System.out.println("Infelizmente essa fruta não está em promoção hoje.");
		}
		
		sc.close();
	}

}
