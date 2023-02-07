package aula04.poo;
public class Caneta {
    public String modelo;
    private float ponta;
    public boolean  tampada;
    public String cor;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void status(){
        System.out.println("Cor: " + this.getCor());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("tampada: " + this.isTampada());
        System.out.println("============================");
    }
}
