/*Problema "terreno"
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo.*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		System.out.printf("Área do terreno = %.2f%n", area);
		
		preco = area * metroQuadrado;
		System.out.printf("Preço do terreno =  %.2f", preco);
		
		
		
		sc.close();
	}

}
