package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 28, "M");
        p[1] = new Pessoa("Verônica", 29, "F");        
        
        l[0] = new Livro("Harry Potter", "J.K Rowling", 565, p[1]);
        l[1] = new Livro("Banco de Dados", "Christopher J. Date", 900, p[0]);
        l[2] = new Livro("O Ickabog", "JK Rowling", 281, p[1]);
        l[0].abrir();
        l[0].folhear(500);        
        System.out.println(l[0].detalhes());
        System.out.println("");
        System.out.println(l[1].detalhes());
        System.out.println("");
        System.out.println(l[2].detalhes());
    }
    
}
