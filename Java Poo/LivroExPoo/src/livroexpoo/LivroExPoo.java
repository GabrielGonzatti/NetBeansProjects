package livroexpoo;

public class LivroExPoo {

    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.cor = "preto";
        l1.paginas = 100;
        l1.título = "Eclipse";
        l1.abrir();
        
        l1.status();
        l1.ler();
        //código funcionando normalmente sem desvios!
        
    }
    
}
