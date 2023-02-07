package aula02bpoo;

public class Aula02bPOO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = ("Azul");
        c1.ponta = 0.5f;
        c1.tampar();
        c1.carga = 100;
        
        c1.status();
        c1.rabiscar();
        System.out.println("==================");
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = ("preto");
        c2.ponta = 0.5f;
        c2.destampar();
        c2.carga = 100;
        c2.status();
        c2.rabiscar();
    }
    
}
