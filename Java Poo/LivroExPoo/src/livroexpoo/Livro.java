package livroexpoo;

public class Livro {
    String cor;
    String título;
    int paginas;
    boolean fechado;
    
    void fechar(){
        this.fechado = true;
    }
    void abrir(){
        this.fechado = false;
    }
    void ler(){
        if (this.fechado == true){
            System.out.println("[ERRO] Verifique se o livro está aberto para ler!");
        } else {
        System.out.println("Lendo");
        }
    }
    void status(){
        System.out.println("Livro: " + this.título);
        System.out.println("Cor: " + this.cor);
        System.out.println("Nº de páginas: " + this.paginas);
        System.out.println("Está fechado? " + this.fechado);
    }
}
