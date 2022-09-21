
package Principal;

import dados.Pessoa;

public class Inicio {
    
    public static void main (String args[]){ 
        
        Pessoa pes = new Pessoa();
        Pessoa pes2 = new Pessoa("Lucas", "555-555", 28);
        
        pes.nome = "Fulano";
        pes.idade = 22;
        pes.telefone = "(00) 7654-3210";
        
        System.out.println(pes.mostrarDados());
        System.out.println(pes2.mostrarDados());
       
    
    }

    
}
