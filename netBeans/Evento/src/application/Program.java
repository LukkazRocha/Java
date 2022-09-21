package application;

public class Program {

    public static void main(String[] args) {
        Evento evento = new Evento("E3", "04/06/2023");
        Evento evento1 = new Evento("Comic Con", "15/05/2022");
        
        IngressoPista pista[] = new IngressoPista[1];
        IngressoVip vip[] = new IngressoVip[2];
        IngressoCamarote camarote[] = new IngressoCamarote[1];        
        
        pista[0] = new IngressoPista("Weslei", "000.000.000-00", evento);        
        evento.venderIngresso(pista[0]);
        
        vip[0] = new IngressoVip("Lucas", "111.111.111-01", evento);        
        evento.venderIngresso(vip[0]);
        
        vip[1] = new IngressoVip("Verônica", "222.222.222-02", evento);        
        evento.venderIngresso(vip[1]);
        
        camarote[0] = new IngressoCamarote("Gabriele", "333.333.333-03", evento);                
        evento.venderIngresso(camarote[0]);
        
        evento.mostrarIngressos();        

        
    }
    
}
