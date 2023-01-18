package aula02bpoo;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Qual seria o modelo? " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual o tamanho da ponta? " + this.ponta);
        System.out.println("Quanto está a carga? " + this.carga);
    }
    void rabiscar () {
        if(this.tampada==true || this.carga == 0){
            System.out.println("[ERRO] [verifique se o objeto está apto para uso!]");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar() {
        this.tampada = true;
    }
        void destampar() {
        this.tampada = false;
    }
}
