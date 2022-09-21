
package application;

import entities.Calculadora;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        int opt;
        
        do {
            menu();
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    calc.recebeValor();
                    System.out.printf("A SOMA DE %.1f + %.1f = %.1f%n", calc.n1, calc.n2, calc.soma());
                    break;
                case 2:
                    calc.recebeValor();
                    System.out.printf("A SUBTRAÇÃO DE %.1f - %.1f = %.1f%n", calc.n1, calc.n2, calc.sub());
                    break;
                case 3:
                    calc.recebeValor();
                    System.out.printf("A MULTIPLICAÇÃO DE %.1f X %.1f = %.1f%n", calc.n1, calc.n2, calc.multi());
                    break;
                case 4:
                    calc.recebeValor();
                    System.out.printf("A DIVISÃO DE %.1f / %.1f = %.1f%n", calc.n1, calc.n2, calc.div());
                    break;
                case 5:
                    calc.recebeValor(calc.n1);
                    System.out.printf("%.1f ELEVADO AO QUADRADO = %.1f", calc.n1, calc.pot());
                    break;
                default:
                    if (opt != 0) {
                        System.out.println("OPÇÃO INVÁLIDA!!!");
                    }
            }
        } while (opt != 0); 
        
        System.out.println("ENCERRANDO...");
        
        sc.close();
    }
    
    static void menu() {
        System.out.println("");
        System.out.println("----------MENU----------");
        System.out.println("------------------------");
        System.out.println("DIGITE 1 - SOMA;");
        System.out.println("DIGITE 2 - SUBTRAÇÃO;");
        System.out.println("DIGITE 3 - MULTIPLICAÇÃO;");
        System.out.println("DIGITE 4 - DIVISÃO;");
        System.out.println("DIGITE 5 - POTENCIAÇÃO;");
        System.out.println("DIGITE 0 - ENCERRAR;");
        System.out.println("------------------------");
    }
    
}
