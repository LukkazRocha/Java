package application;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;    
    private float valorUnico;
    private int capacMaxima;
    private List<Ingresso> listaIngresso;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
        this.capacMaxima = 1000;
        this.valorUnico = 150f;
        this.listaIngresso = new ArrayList<Ingresso>();
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(float valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacMaxima() {
        return capacMaxima;
    }

    public void setCapacMaxima(int capacMaxima) {
        this.capacMaxima = capacMaxima;
    }

    public List<Ingresso> getIngresso() {
        return listaIngresso;
    }

    public void setIngresso(List<Ingresso> listaIngresso) {
        this.listaIngresso = listaIngresso;
    }  
    
    public void venderIngresso(Ingresso ingresso) {
        if (this.getIngresso().size() < this.capacMaxima) {
            listaIngresso.add(ingresso);
        } else {            
            System.out.println("### INGRESSOS ESGOTADOS ###");                        
        }        
    }    
    
    public void quantIngressos() {        
        System.out.println("Ingressos vendidos: " + this.getIngresso().size());
    }
    
    public void mostrarIngressos() {
        int i = 1;
        for (Ingresso x : listaIngresso) {
            System.out.println(i + x.mostrarResumo());
            System.out.println(x.toString());
            i++;                        
        }        
    }   
}
