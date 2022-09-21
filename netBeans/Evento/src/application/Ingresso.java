package application;

public abstract class Ingresso {
    protected String nome;
    protected String cpf;
    protected Evento eventoRelacionado;
    protected float valor;

    public Ingresso(String nome, String cpf, Evento eventoRelacionado) {
        this.nome = nome;
        this.cpf = cpf;
        this.eventoRelacionado = eventoRelacionado;        
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Evento getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(Evento eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void calcularValor() {
        this.setValor(this.getEventoRelacionado().getValorUnico());
    }
    
    public String mostrarResumo() {
        return  "### COMPROVANTE DE INGRESSO ###\n" 
                + "Nome: " + this.getNome()
                + ", CPF: " + this.getCpf()
                + "\nEvento: " + this.getEventoRelacionado().getNome()
                + ", Data: " + this.getEventoRelacionado().getData();               
                
    }     
}
