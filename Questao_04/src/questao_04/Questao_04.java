/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_04;

/**
 *
 * @author fabri
 */
public class Questao_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       quadrado q1 = new quadrado(2);
       quadrado q2 = new quadrado(4);
       quadrado q3 = new quadrado(5);
       
       System.out.println("A area do 1º quadrado é " + q1.area() + " e o perimetro é " + q1.perimetro());
       System.out.println("A area do 2º quadrado é " + q2.area() + " e o perimetro é " + q2.perimetro());
       System.out.println("A area do 3º quadrado é " + q3.area() + " e o perimetro é " + q3.perimetro());
    
    }
    
}
