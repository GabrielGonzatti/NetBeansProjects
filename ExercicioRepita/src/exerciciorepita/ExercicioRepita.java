/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzatti
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        int c = 0;
        int par = 0;
        int imp = 0;
        int med = 0;
        int cem = 0;
        
        do {      
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valores(0 interrompe)"));
        s += n; //somando!
        c++; //o c será meu contador e ele contará +1 para que eu saiba quantas vezes digitei!
        
        if (n > 100){
            cem++; //valores acima de 100!
        }
        
        if (n % 2 == 0){ //se s (valor de soma) dividido por 2, tiver o resto == a 0 saberemos que o valor é par!
            par++;
        } else {
            imp++;
        }
        
        med = s/c; //calculando a média!
        
        } while (n != 0);
        JOptionPane.showMessageDialog(null, 
                "<html> Resultado Final <br> <hr> " + " <br>somatorio vale: " + s + 
                "<br> Número de valores digitados: " + c +
                "<br> Número de valores pares: " + par +
                "<br> Número de valores ímpares: " + imp +
                "<br> Média dos valores: " + med +
                "<br> Valores acima de 100: " + cem +
                         "</html>");
        
        
        
    }
    
}
