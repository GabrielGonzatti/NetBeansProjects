package aula02bpoo;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Qual seria o modelo? " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual o tamanho da ponta? " + this.ponta);
        System.out.println("Quanto está a carga? " + this.carga);
    }
    public void rabiscar () {
        if(this.tampada==true || this.carga == 0){
            System.out.println("[ERRO] [verifique se o objeto está apto para uso!]");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    protected void tampar() {
        this.tampada = true;
    }
    protected    void destampar() {
        this.tampada = false;
    }
}
