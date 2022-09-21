package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String[] list = new String[5];
	
	System.out.println("Insira sua lista de compras: ");
	for (int i = 0; i < list.length; i++) {
		list[i] = sc.nextLine();
	}
	
	System.out.println();
	System.out.println("As frutas no seu carrinho são");
	for (int i = 0; i < list.length; i++) {
		System.out.print(list[i] + " ");
	}
	
	sc.close();
	}

}
