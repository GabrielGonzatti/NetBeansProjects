/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author Gonzatti
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc=0; cc<=100; cc+=10){
            //System.out.println("Cambalhota " + (cc+1));
            System.out.println(cc);
        }
        /*
        O comando acima seria o mesmo que:
        int cc = 0;
        while (cc<4){
        cc++
        System.out.println("Cambalhota " + (cc+1));
        }
        
        Ou o mesmo que:
        
        do{
        cc++
        System.out.println("Cambalhota " + (cc+1));
        } while (cc<4);
        
        
        */
    }
    
}
