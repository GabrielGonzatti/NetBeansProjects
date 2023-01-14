/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Gonzatti
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number[] = {10,20,30,40,50,60};
        System.out.println("Total de casas de number: " + number.length);
        //importante saber que, será armazenado 6 casas ou 6 valores, apenas começamos a contar de 0 (0,1,2,3,4,5)
        for (int c=0;c<=5;c++){
            System.out.println("Na posição " + c + " temos o número: " + number[c] + " ");
        }
         //note que é na posição c, pois esta posição irá modificar(é um contador!)
    }
    
}
