package entities;

import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    
    public double n1;
    public double n2;
    
    
    public void recebeValor() {
        System.out.println("Digite um número: ");
        this.n1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        this.n2 = sc.nextDouble();
    }
    
    public void recebeValor(double n1) {
        System.out.println("Digite o número que será elevado ao quadrado: ");
        this.n1 = sc.nextDouble();
    }
    
    public double soma() {
        return n1 + n2;
    }
    
    public double sub() {
        return n1 - n2;
    }
    
    public double multi() {
        return n1 * n2;
    }
    
    public double div() {
        return n1 / n2;
    }
    public double pot() {
        return Math.pow(n1, 2);
    }
   
    
    
}
