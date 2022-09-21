package application;

public class IngressoPista extends Ingresso {

    public IngressoPista(String nome, String cpf, Evento eventoRelacionado) {
        super(nome, cpf, eventoRelacionado);
        calcularValor();
    } 
    
    public void imprimirValor() {        
        System.out.println("### TIPO DE INGRESSO ###");
        System.out.printf("Ingresso Pista: R$%.2f\n", this.getValor());
        System.out.println("___________________________________");
    }
        
    @Override
    public String toString() {        
        return
        String.format("### TIPO DE INGRESSO ### "
                    + "\nIngresso Pista: R$%.2f\n", this.getValor())
                    + "______________________________\n";
    }
    
}
