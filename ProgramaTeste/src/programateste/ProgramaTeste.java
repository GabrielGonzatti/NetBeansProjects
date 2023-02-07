/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programateste;

/**
 *
 * @author Gonzatti
 */
public class ProgramaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "hello";
        
        // c = c + i; -- tipos incompatíveis
        // s += i; -- String pode receber o var i pois este + não significa apenas soma, mas também concatenação
        // i += s; -- tipos incompatíveis
        // c += s; -- tipos incompatíveis
        // i += l; -- são da mesma família!
        
    }
    
}
