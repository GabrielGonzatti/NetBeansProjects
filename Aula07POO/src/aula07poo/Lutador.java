package aula07poo;

public class Lutador {
        //atributos:
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //método contrutor:

    public Lutador(String no, String na,int id, float al, float pe, int vi, int de, int em) {
        setNome(no);
        setNacionalidade(na);
        setAltura(al);
        setIdade(id);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }
    
    
    //Métodos:
    
    public void apresentar(){
        System.out.println("Lutador... " + getNome() + "!");
        System.out.println("Sua Origem é... " + getNacionalidade() + "!");
        System.out.println("Sua altura é... " + getAltura() + "!");
        System.out.println("Seu peso é... " + getPeso() + "kg !");
        System.out.println("Tem " + getVitorias() + " Vitórias!");
        System.out.println("Tem " + getDerrotas() + " Derrotas!");
        System.out.println("Tem " + getEmpates() + " Empates!");
    }
    public void Status(){
        System.out.println(getNome());
        System.out.println(getIdade() + "Anos");
        System.out.println(getAltura() + "Altura");
        System.out.println(getPeso() + "kg");
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + "Derrotas");
        System.out.println(getEmpates() + "Empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() +1 );
    }
    public void empatarLuta(){
        setEmpates(getEmpates() +1);
    }
    
    //metodos especiais:

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }
    
    public int getIdade(){
        return idade;
    }

    public void setAltura(float al) {
        this.altura = al;
    }
    
    public float getAltura(){
        return altura;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    //criar setCategoria()
    } 
    private void setCategoria() {
        if (peso < 52.2 || peso > 120.2){
            System.out.println("Peso Inválido!");
        } else if (peso >= 52.2){
            categoria = "Leve";
        } else if (peso <= 83.9){
            categoria = "Medio";
        } else {
            categoria = "Pesado";
        }
    }
    public float getPeso() {
        return peso;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    
    public int getVitorias(){
        return vitorias;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    
    public int getDerrotas(){
        return derrotas;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
    
    public int getEmpates(){
        return empates;
    }

    
    
    
    

}
