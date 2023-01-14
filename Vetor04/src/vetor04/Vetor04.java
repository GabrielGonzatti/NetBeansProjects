/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Gonzatti
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {1,3,5,7,4};
        for (int valor: v){
            System.out.println(valor);
        }
        int p = Arrays.binarySearch(v, 7);
        System.out.println("Encontrei o valor na posição: " + p);
    }
    
}
