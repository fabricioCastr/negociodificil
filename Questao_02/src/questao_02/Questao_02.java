/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_02;

/**
 *
 * @author fabri
 */
public class Questao_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       lampada lampa1 = new lampada();
       lampada lampa2 = new lampada();
        lampa1.liga();
        lampa2.desliga();
        
        lampa1.observa();
        lampa2.observa();
    
    }
    
}
