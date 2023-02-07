package aula05poo;

public class ContaBanco {
    //atributos abaixo:
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Status:
    public void estadoAtual(){
       
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("------------------------");
        
        

    }
    
    //Método construtor:
    /*public ContaBanco(float saldo, boolean status){
        this.setSaldo(0);
        this.setStatus(false);
    }*/
    //métodos personalizados:
    public void abrirConta(String t){
        //status da conta, para abri-lá, fará com que fique verdadeiro!
        this.setTipo(t);
        this.setStatus(true);
        //Se a conta for CC ganha-se 50 reais, caso seja CP ganha-se 150 reais!
        if (t == "CC"){
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        //Método para fechar a conta!
        //Para fechar a conta, ela não ter valores diferentes de 0!
        if (this.saldo != 0){
            System.out.println("[ERRO] Verifique seu saldo, pois para fechar a conta é necessário o saldo estar zerado!");
            
        } else {
           this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado com sucesso na conta" + this.getDono() + "!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        //Saque somente possível com o status da conta verdadeiro e com saldo maior do que o saque!
        if (this.getStatus() && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Valor Sacado com sucesso na conta de " + this.getDono() + "!");
        } else {
            System.out.println("[ERRO] Verificar o status da conta e o saldo!");
        }
    }
    public void pagarMensal(){
        //método para os pagamentos mensais!
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        } if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v); 
            System.out.println("O valor mensal foi pago com sucesso por " + this.getDono() + "!");
        } else {
            System.out.println("[ERRO] impossível pagar!");
        }
    }
    //set e get numConta:
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    //set e get tipo:
      public void setTipo(String t){
       this.tipo = t;
    }
      public String getTipo(){
          return this.tipo;
      }
    //set e get dono:
      public void setDono(String n){
          this.dono = n;
    }
      public String getDono(){
          return this.dono;
      }
      //set e get saldo:
      public void setSaldo(float s){
          this.saldo = s;
      }
      public float getSaldo(){
          return this.saldo;
      }
      //set e get status:
      public void setStatus(boolean stat){
          this.status = stat;
      }
      public boolean getStatus(){
          return this.status;
      }
      
      
}
