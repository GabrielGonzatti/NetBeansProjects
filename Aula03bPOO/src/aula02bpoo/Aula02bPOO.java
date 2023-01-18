package aula02bpoo;

public class Aula02bPOO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 100;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
