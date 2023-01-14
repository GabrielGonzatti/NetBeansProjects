/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author Gonzatti
 */
public class Operacoes {
    //public pode executar em qualquer código, privated não vai permitir a execução e protect
    public static String contador(int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
           s += (c + " ");
        }
        return s;
    }
}
