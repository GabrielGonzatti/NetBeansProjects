/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author Gonzatti
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int cont=0; cont<mes.length;cont++){
            System.out.println("O mês " + mes[cont] + " tem total de dias: " + dias[cont]);
        }
    }
    
}
