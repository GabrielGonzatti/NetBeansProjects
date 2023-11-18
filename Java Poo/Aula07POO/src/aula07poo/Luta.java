
package aula07poo;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Metodos:
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(){
        if (isAprovada()){
            System.out.println("###DESAFIADO###");
            desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            desafiante.apresentar();
            System.out.println("====RESULTADO DA LUTA====");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch (vencedor){
            case 0: //empate
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1: //desafiado vencedor
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2: //desafiante vencedor
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }
            System.out.println("=============================");
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
    //metodos especiais:
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public int getRounds() {
        return rounds;
    }

    public void setAprovada(boolean aprov) {
        this.aprovada = aprov;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    
    
    
    
    
}
