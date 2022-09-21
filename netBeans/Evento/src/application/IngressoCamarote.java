package application;

public class IngressoCamarote extends Ingresso {
    
    public IngressoCamarote(String nome, String cpf, Evento eventoRelacionado) {
        super(nome, cpf, eventoRelacionado);
        calcularValor();
    }
    
    @Override
    public void calcularValor() {
        this.setValor(this.getEventoRelacionado().getValorUnico() * 1.6f);
    }
    
    public void imprimirValor() {        
        System.out.println("### TIPO DE INGRESSO ###");
        System.out.printf("Ingresso Camarote: R$%.2f\n", this.getValor());
        System.out.println("___________________________________");
    }
    
    @Override
    public String toString() {        
        return
        String.format("### TIPO DE INGRESSO ### "
                    + "\nIngresso Camarote: R$%.2f\n", this.getValor())
                    + "______________________________\n";
    }
}
