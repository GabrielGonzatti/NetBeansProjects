package aula06poo;

public class ControleRemoto implements Controlador {
    //Atributos:
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodo Contrutor:

    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.tocando = false;
    }
    
    
    
    //Metodos Especiais:
//GET
    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }
//SET
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("Está ligaedo? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10){
            System.out.print(" | ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        //O NAO é !(aqui dentro o método ou atributo da expressão)
      if(this.isLigado() && !(this.isTocando())){
          this.setTocando(true);
      }  
    }
    

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
    
}
