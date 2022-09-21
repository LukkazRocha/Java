package application;

public class IngressoVip extends Ingresso {

    public IngressoVip(String nome, String cpf, Evento eventoRelacionado) {
        super(nome, cpf, eventoRelacionado);
        calcularValor();
    }    
    
    @Override
    public void calcularValor() {
        this.setValor(this.getEventoRelacionado().getValorUnico() * 1.3f);
    }
    
    public void imprimirValor() {        
        System.out.println("### TIPO DE INGRESSO ###");
        System.out.printf("Ingresso Vip: R$%.2f\n", this.getValor()); 
        System.out.println("___________________________________");
    }
    
    @Override
    public String toString() {        
        return
        String.format("### TIPO DE INGRESSO ### "
                    + "\nIngresso Vip: R$%.2f\n", this.getValor())
                    + "______________________________\n";
    }
    
}
